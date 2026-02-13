package M7_Activity3.controller;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.put;

import java.util.HashMap;
import java.util.Map;

import M7_Activity3.JsonUtil;
import M7_Activity3.dto.MovieRequestDTO;
import M7_Activity3.model.Movie;
import M7_Activity3.service.MovieService;

public class MovieController {

	private MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	public void registerRoutes() {
		// Get Movies List
		get("/movies", (req, res) -> {
			Map<String, Object> response = new HashMap<>();
			response.put("status", "Successful");
//			response.put("data", movieRepository.findAll());
			response.put("data", this.movieService.getAllMovies());
			return JsonUtil.toJson(response);
		});

		// Create Movie List
		post("/movies", (req, res) -> {
			Map<String, Object> response = new HashMap<>();
			MovieRequestDTO movie = JsonUtil.fromJson(req.body(), MovieRequestDTO.class);

			response.put("status", "SUCCESS");
			response.put("data", this.movieService.createMovie(movie));

			return JsonUtil.toJson(response);
		});

		// Edit Movie
		put("/movies/:id", (req, res) -> {
			Map<String, Object> response = new HashMap<>();
			Movie movie = JsonUtil.fromJson(req.body(), Movie.class);

//			EntityTransaction tx = em.getTransaction();
//			try {
//				tx.begin();
//				movie = movieRepository.save(movie);
//				tx.commit();
//				response.put("status", "SUCCESS");
//				response.put("data", movie);
//			} catch (Exception e) {
//				logger.error("Saving movie failed");
//				response.put("status", "ERROR");
//				response.put("message", "Saving movie failed!");
//			}

			return JsonUtil.toJson(response);
		});

	}

}
