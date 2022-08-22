import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MovieLibrary {
    private static ArrayList<Movie> movies;

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        MovieLibrary.movies = movies;
    }

    public static void displayFilteredMoviesTitles(List<Movie> filteredMovies) {
        if (filteredMovies.isEmpty()) {
            System.out.println("There is no data that matches the given filters");
        } else {
            for (Movie filteredMovie : filteredMovies) {
                System.out.println(filteredMovie.getTitle());
            }
        }
    }

    public static List<Movie> getMoviesBetweenTwoDates(int[] dates) {
        int startDate = dates[0];
        int endDate = dates[1];
        return movies
                .stream()
                .filter(i -> i.getReleaseYear() >= startDate
                        && i.getReleaseYear() <= endDate)
                .collect(Collectors.toList());
    }

    public static void displayMoviesInfo(int movieNumber) {
        System.out.println(movies.get(movieNumber));
    }

    public static int chooseRandomMovie() {
        Random random = new Random();
        return random.nextInt(MovieLibrary.movies.size());
    }

    public static List<Movie> getMoviesWithSelectedActor(String[] names) {
        String firstName = names[0];
        String lastName = names[1];
        return movies
                .stream()
                .filter(i -> i.getActors()
                        .stream()
                        .anyMatch(j -> j.firstName().equals(firstName) && j.lastName().equals(lastName)))
                .collect(Collectors.toList());
    }
}