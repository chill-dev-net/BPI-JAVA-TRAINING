package M7_Activity1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	private static final ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) {
		// intialize entityManager;
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		// initialize movieRepository
		MovieRepository movieRepository = new MovieRepository(em);

		// Start server on port 4567 (default)
		port(4567);

		// add routes here

		// Get Profile List
		get("/movies", (req, res) -> {
			Map<String, Object> response = new HashMap<>();
			response.put("status", "Successful");
			response.put("data", movieRepository.findAll());
			return JsonUtil.toJson(response);
		});

		// Create Profile List
		post("/movies", (req, res) -> {
			Map<String, Object> response = new HashMap<>();
			Movie movie = JsonUtil.fromJson(req.body(), Movie.class);

			EntityTransaction tx = em.getTransaction();
			try {
				tx.begin();
				movie = movieRepository.save(movie);
				tx.commit();
				response.put("status", "SUCCESS");
				response.put("data", movie);
			} catch (Exception e) {
				logger.error("Saving movie failed");
				response.put("status", "ERROR");
				response.put("message", "Saving movie failed!");
			}
			
			return JsonUtil.toJson(response);
		});
	}
}
