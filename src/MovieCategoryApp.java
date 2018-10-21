import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class MovieCategoryApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		MovieList filmList = new MovieList();

		System.out.println("Welcome to the Movie List Application!");
		// TODO create method that stores movie list (and categories)
		// TODO ask user what category they'd like to see list of films in a certain
		// category (and use numbers rather than the name)
		// TODO create method to display movie list by each category (and in
		// alphabetical order)
		// TODO ask user if they would like to continue

	}

	public static void createMovieList() {
		MovieList filmOne = new MovieList("Blazing Saddles", "comedy");
		MovieList filmTwo = new MovieList("ex machina", "scifi");
		MovieList filmThree = new MovieList("Hot Fuzz", "comedy");
		MovieList filmFour = new MovieList("Moana", "animated");
		MovieList filmFive = new MovieList("The Truman Show", "drama");
		MovieList filmSix = new MovieList("Shrek", "animated");
		MovieList filmSeven = new MovieList("Moonlight", "drama");
		MovieList filmEight = new MovieList("Under the Skin", "drama");
		MovieList filmNine = new MovieList("Serenity", "scifi");
		MovieList filmTen = new MovieList("Anastasia", "animated");

	}

}
