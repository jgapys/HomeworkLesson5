import java.util.Scanner;

public class Menu {
    public static void chooseMenuOption() {
        while (true) {
            System.out.println("What do you want to do? Please choose one of the following by entering the correct number:");
            System.out.println("1 - Display the titles of movies released between the selected dates");
            System.out.println("2 - Display all information about a random movie");
            System.out.println("3 - Display movies with the selected actor");
            System.out.println("4 - End program");

            int userChoice = new Scanner(System.in).nextInt();

            switch (userChoice) {
                case 1 ->
                        MovieLibrary.displayFilteredMoviesTitles(MovieLibrary.getMoviesBetweenTwoDates(DataFromUser.getTwoDatesFromUser()));
                case 2 -> MovieLibrary.displayMoviesInfo(MovieLibrary.chooseRandomMovie());
                case 3 ->
                        MovieLibrary.displayFilteredMoviesTitles(MovieLibrary.getMoviesWithSelectedActor(DataFromUser.getActorsDataFromUser()));
                case 4 -> {
                    System.out.println("Bye!");
                    System.exit(0);
                }
            }
        }
    }
}