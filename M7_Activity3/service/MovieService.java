package M7_Activity3.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import M7_Activity3.EntityManagerUtil;
import M7_Activity3.Main;
import M7_Activity3.dto.MovieRequestDTO;
import M7_Activity3.model.Movie;
import M7_Activity3.repository.MovieRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class MovieService {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	private EntityManager em = EntityManagerUtil.getInstance().createEntityManager();
	private MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = new MovieRepository(em);
	}

	public MovieService() {

	}

	public List<Movie> getAllMovies() {
		return this.movieRepository.findAll();
	}

	public Movie getMovieById(Long id) {
		return null;
	}

	public Movie createMovie(MovieRequestDTO movieDTO) {
		EntityTransaction tx = em.getTransaction();
		Movie movie = new Movie();
		
		try {
			tx.begin();
			movie.setTitle(movieDTO.getTitle());
			movie.setDirector(movieDTO.getDirector());
			movie.setShowingDate(movieDTO.getShowingDate());
			
			movie = movieRepository.save(movie);
			tx.commit();

		} catch (Exception e) {
			logger.error("Saving movie failed");

		}
		return movie;
	}

	public Movie editMovie(Movie movie) {
		return null;
	}

}
