package Day4.Tasks;
import java.util.ArrayList;
import java.util.List;

class Movie {
    String title;
    String director;
    List<String> actors;
    List<String> reviews;

    public Movie(String title, String director, List<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<>();
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public List<String> getReviews() {
        return reviews;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }
}

public class MovieTask {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("Actor1");
        actors.add("Actor2");

        Movie movie = new Movie("MovieTitle", "DirectorName", actors);

        movie.addReview("Great movie! Loved the storyline.");
        movie.addReview("The acting was superb.");

        List<String> movieReviews = movie.getReviews();
        System.out.println("Movie Reviews:");
        for (String review : movieReviews) {
            System.out.println(review);
        }
    }
}
