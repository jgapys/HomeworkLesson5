import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Movie {
    private String title;
    @JsonProperty("date")
    private int releaseYear;
    private Director director;
    private String genre;
    private List<Actor> actors;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Director getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public List<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "title: " + title + "\n" +
                "director: " + director + "\n" +
                "genre: " + genre.toLowerCase() + "\n" +
                "date: " + releaseYear + "\n" +
                "actors: " + actors.toString().replaceAll("(^\\[|\\]$)", "");
    }
}