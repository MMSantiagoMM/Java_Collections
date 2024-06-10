import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MovieCollection movieCollection = new MovieCollection();
        menu(movieCollection);



    }





    public static void menu(MovieCollection movieCollection){
        Integer option;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("""
                    Welcome to the Movie Collection Manager!
                          1. Add a new movie
                          2. Remove a movie
                          3. List all movies
                          4. Find movies by genre
                          5. Find movies by year
                          6. Sort movies by title
                          7. sort movies by year
                          9. Add several movies
                          8. Exit""");

            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1 -> {
                    System.out.println("Enter title");
                    String title = sc.next();
                    System.out.println("Enter genre");
                    String genre = sc.next();
                    System.out.println("Enter year");
                    String year = sc.next();

                    System.out.println(movieCollection.addMovie(
                            new Movie(title,genre,year)
                    ));
                    menu(movieCollection);
                }
                case 2 -> {
                    System.out.println(movieCollection.removeMovie(sc.next()));
                    menu(movieCollection);
                }
                case 3 -> {
                    System.out.println(movieCollection.listAllMovies());
                    menu(movieCollection);
                }
                case 4 -> {
                    System.out.println(movieCollection.listMoviesByGenre(sc.next()));
                    menu(movieCollection);
                }
                case 5 -> {
                    System.out.println(movieCollection.listMoviesByYear(sc.nextInt()));
                    menu(movieCollection);
                }
                case 6 -> {
                    System.out.println(movieCollection.sortMoviesByTitle());
                    menu(movieCollection);
                }
                case 7 -> {
                    System.out.println(movieCollection.sortMoviesByYear());
                    menu(movieCollection);
                }
                case 8 -> {
                    System.out.println("Good bye");
                }
                case 9 -> {
                    Movie movie1 = new Movie("Terminator","Action","1995");
                    Movie movie2 = new Movie("Spiderman","Adventure","2005");
                    Movie movie3 = new Movie("Harry Potter","Adventure","2009");
                    List<Movie> severalMovies = new ArrayList<>();
                    severalMovies.add(movie1);
                    severalMovies.add(movie2);
                    severalMovies.add(movie3);
                    System.out.println(movieCollection.addMovies(severalMovies));
                }
                default -> {
                    System.out.println("Enter a valid option");
                    menu(movieCollection);
                }
            }

        }while (!option.equals(8));


    }
}