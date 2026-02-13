package M7_Activity3;

import static spark.Spark.port;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import M7_Activity1.EntityManagerUtil;
import M7_Activity3.controller.MovieController;
import M7_Activity3.repository.MovieRepository;
import M7_Activity3.service.MovieService;
import jakarta.persistence.EntityManager;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	private static final ObjectMapper mapper = new ObjectMapper();

	public static void main(String[] args) {

		// Start server on port 4567 (default)
		port(4567);

		// add routes here
		// intialize entityManager;
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		// initialize movieRepository
		MovieRepository movieRepository = new MovieRepository(em);
		MovieService movieService = new MovieService(movieRepository);
		MovieController movieController = new MovieController(movieService);
		movieController.registerRoutes();

	}
}
