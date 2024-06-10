import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieCollection implements IMovie {

    List<Movie> movies = new ArrayList<>();

    public MovieCollection() {
    }

    public MovieCollection(List<Movie> movies) {
        this.movies = new ArrayList<>();
    }

    @Override
    public String addMovie(Movie movie) {

        if(movie.getGenre()==null || movie.getTitle() ==null || movie.getYear() ==null){
            return "No movie was added";
        }
        movies.add(movie);
        return "Movie " + movie.getTitle() + " was added";
    }

    @Override
    public String addMovies(List<Movie> movies) {
        this.movies.addAll(movies);
        return "Movies were added";
    }

    @Override
    public String removeMovie(String title) {
        if (!movies.isEmpty()) {
            for (Movie movie : movies) {
                if (movie.getTitle().contains(title)) {
                    movies.remove(movie);
                    return "Movie " + movie.getTitle() + " was removed";
                }
            }
        }
        return "The collection is empty";
    }

    @Override
    public List<Movie> listAllMovies() {
        if(movies.isEmpty()){
            return new ArrayList<>();
        }else{
            return movies;
        }
    }

    @Override
    public List<Movie> listMoviesByGenre(String genre) {
        if (!movies.isEmpty()) {
            List<Movie>moviesByGenre = new ArrayList<>();
            for (Movie movie : movies) {
                if (movie.getGenre().contains(genre)) {
                    moviesByGenre.add(movie);

                }
            }
            return moviesByGenre;
        }
        return new ArrayList<>();
    }

    @Override
    public List<Movie> listMoviesByYear(Integer year) {
        if (!movies.isEmpty()) {
            List<Movie> moviesYear = new ArrayList<>();
            for (Movie movie : movies) {
                if (movie.getYear().equals(year)) {
                    moviesYear.add(movie);
                }
            }
            return moviesYear;
        }
        return new ArrayList<>();
    }

    @Override
    public List<Movie> sortMoviesByTitle() {
        movies.sort(Comparator.comparing(Movie::getTitle));
        return movies;
    }

    @Override
    public List<Movie> sortMoviesByYear() {
        movies.sort(Comparator.comparing(Movie::getYear));
        return movies;
    }

}
