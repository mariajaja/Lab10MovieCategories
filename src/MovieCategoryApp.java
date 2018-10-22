import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author Mariah Hall
 *
 */
public class MovieCategoryApp {

	/**
	 * This program contains a list of 10 films separated into 4 genres. It asks the
	 * user to choose a genre and then lists all of the films contained within that
	 * genre.
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		List<MovieList> filmList = new ArrayList<>();
		String userResponse;

		System.out.println("Welcome to the Movie List Application!");

		System.out.println("There are 10 movies in this list.");

		// calls method to add films into the arrays
		filmList = createMovieList(filmList);

		do {
			// method to show list of films by user's chosen category
			categoryList("Comedy", "SciFi", "Animated", "Drama", userInput, filmList);
			// clears out lines after nextInt()
			userInput.nextLine();

			// ask if user wants to pick a new category
			System.out.print("Continue? (y/n): ");
			userResponse = userInput.nextLine();

		} while (userResponse.toLowerCase().startsWith("y"));

		System.out.println("Goodbye!");

	}

	// method that hold the list of films
	public static List<MovieList> createMovieList(List<MovieList> filmList) {

		// list of categories to be used
		String categoryOne = "Comedy";
		String categoryTwo = "SciFi";
		String categoryThree = "Animated";
		String categoryFour = "Drama";

		MovieList film = new MovieList("Blazing Saddles", categoryOne);
		filmList.add(film);
		film = new MovieList("ex machina", categoryTwo);
		filmList.add(film);
		film = new MovieList("Hot Fuzz", categoryOne);
		filmList.add(film);
		film = new MovieList("Moana", categoryThree);
		filmList.add(film);
		film = new MovieList("The Truman Show", categoryFour);
		filmList.add(film);
		film = new MovieList("Shrek", categoryThree);
		filmList.add(film);
		film = new MovieList("Moonlight", categoryFour);
		filmList.add(film);
		film = new MovieList("Under the Skin", categoryFour);
		filmList.add(film);
		film = new MovieList("Serenity", categoryTwo);
		filmList.add(film);
		film = new MovieList("Anastasia", categoryThree);
		filmList.add(film);

		return filmList;

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
