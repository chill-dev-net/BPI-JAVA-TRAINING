package M7_Activity3.dto;

import M7_Activity3.model.Movie;

public class MovieRequestDTO {

	private String title;
	private String director;
	private String showingDate;

	public MovieRequestDTO() {
	}

	public MovieRequestDTO(Movie movieEntity) {
		this.setTitle(movieEntity.getTitle());
		this.setDirector(movieEntity.getDirector());
		this.setShowingDate(movieEntity.getShowingDate());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getShowingDate() {
		return showingDate;
	}

	public void setShowingDate(String showingDate) {
		this.showingDate = showingDate;
	}

}
