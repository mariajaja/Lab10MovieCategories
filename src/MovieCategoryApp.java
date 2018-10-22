import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
			MovieList.categoryList("Comedy", "SciFi", "Animated", "Drama", userInput, filmList);
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
}
