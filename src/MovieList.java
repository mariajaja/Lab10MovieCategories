import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

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

	// list for printing out the available genres in the list (four, in this case)
	public static void categoryList(String categoryOne, String categoryTwo, String categoryThree, String categoryFour,
			Scanner userInput, List<MovieList> filmList) {
		int userResponse = 0;
		do {
			try {
				System.out.println("Categories: 1) " + categoryOne + " 2) " + categoryTwo + " 3) " + categoryThree
						+ " 4) " + categoryFour);
				System.out.print("What category are you interested in? ");
				userResponse = userInput.nextInt();

				if (userResponse == 1) {
					// print list of categoryOne
					returnCategoryList(categoryOne, filmList);
				} else if (userResponse == 2) {
					// print list of categoryTwo
					returnCategoryList(categoryTwo, filmList);
				} else if (userResponse == 3) {
					// print list of categoryThree
					returnCategoryList(categoryThree, filmList);
				} else if (userResponse == 4) {
					// print list of categoryFour
					returnCategoryList(categoryFour, filmList);
				} else {
					System.out.println("Sorry, that's not a valid genre number. Pick a number 1-4.");
				}
			} catch (InputMismatchException ex) {
				System.out.println("Sorry, that's not a valid input. Please pick a number 1-4.");
				userInput.nextLine();
			}
		} while (userResponse != 1 && userResponse != 2 && userResponse != 3 && userResponse != 4);
	}

	// sorts through the list to return movie titles for specific categories
	public static void returnCategoryList(String categoryNumber, List<MovieList> filmList) {
		TreeSet<String> filmsInCategory = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		for (int i = 0; i < filmList.size(); i++) {
			if (filmList.get(i).getMovieGenre().equals(categoryNumber)) {
				String filmTitle = filmList.get(i).getMovieTitle();
				filmsInCategory.add(filmTitle);
			}
		}
		System.out.println(categoryNumber + " contains these films: " + filmsInCategory.toString());
	}

}
