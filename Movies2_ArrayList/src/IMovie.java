import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public interface IMovie {


    List<Movie> listMovie = new ArrayList<>();

    static void addMovie(Movie movie){
        listMovie.add(movie);
    }

    static String removeMovie(String title){
        if(searchMovie(title).isEmpty()){
            return "no movie";
        }else{
            listMovie.remove(searchMovie(title).get());
            return "movie was deleted";
        }
    }

    static Optional<Movie> searchMovie(String title){
        for (int i = 0; i < listMovie.size(); i++) {
            if(listMovie.get(i).getTitle().contains(title)){
                return Optional.ofNullable(listMovie.get(i));
            }
        }
        return null;
    }

    static List<Movie> displayAllMovies(){
        return listMovie;
    }

    static void sortMoviesByTitle() {
        listMovie.sort(Comparator.comparing(Movie::getTitle));
    }



}
