/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class MovieList {
	private String movieTitle;
	private String movieGenre;
	private int genreNumber;

	public MovieList() {

	}

	public MovieList(String movieTitle, String movieGenre) {
		this.movieTitle = movieTitle;
		this.movieGenre = movieGenre;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

}
