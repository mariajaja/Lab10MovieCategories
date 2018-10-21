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
		MovieList filmList = new MovieList();
		String userResponse;

		System.out.println("Welcome to the Movie List Application!");

		System.out.println("There are 10 movies in this list.");

		// calls method to add films into the arrays
		createMovieList();

		do {
			// method to show list of films by user's chosen category
			MovieList.categoryList("Comedy", "SciFi", "Animated", "Drama", userInput);
			// clears out lines after nextInt()
			userInput.nextLine();

			// ask if user wants to pick a new category
			System.out.print("Continue? (y/n): ");
			userResponse = userInput.nextLine();

		} while (userResponse.toLowerCase().startsWith("y"));

		System.out.println("Goodbye!");

	}

	// method that hold the list of films
	public static void createMovieList() {

		// list of categories to be used
		String categoryOne = "Comedy";
		String categoryTwo = "SciFi";
		String categoryThree = "Animated";
		String categoryFour = "Drama";

		MovieList filmOne = new MovieList("Blazing Saddles", categoryOne);
		MovieList filmTwo = new MovieList("ex machina", categoryTwo);
		MovieList filmThree = new MovieList("Hot Fuzz", categoryOne);
		MovieList filmFour = new MovieList("Moana", categoryThree);
		MovieList filmFive = new MovieList("The Truman Show", categoryFour);
		MovieList filmSix = new MovieList("Shrek", categoryThree);
		MovieList filmSeven = new MovieList("Moonlight", categoryFour);
		MovieList filmEight = new MovieList("Under the Skin", categoryFour);
		MovieList filmNine = new MovieList("Serenity", categoryTwo);
		MovieList filmTen = new MovieList("Anastasia", categoryThree);

	}
}
