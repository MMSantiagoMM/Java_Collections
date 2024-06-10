import java.util.List;

public interface IMovie {


    String addMovie(Movie movie);

    String addMovies(List<Movie> movies);

    String removeMovie(String title);

    List<Movie> listAllMovies();

    List<Movie> listMoviesByGenre(String genre);

    List<Movie> listMoviesByYear(Integer year);

    List<Movie> sortMoviesByTitle();

    List<Movie> sortMoviesByYear();



}
