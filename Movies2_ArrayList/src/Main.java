import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;
        Movie movies;


        do{
            System.out.println("""
                
                Welcome to our movie's store
                This is the menu:
                1. add movie
                2. remove movie
                3. search by title
                4. display all movies
                5. sort movies by title
                0. exit""");

            option = sc.nextInt();
            sc.nextLine();


            switch (option){
                case 1 -> {
                    movies = new Movie();
                    System.out.println("Add title");
                    movies.setTitle(sc.next());
                    System.out.println("Add director");
                    sc.nextLine();
                    movies.setDirector(sc.next());
                    System.out.println("Add released year");
                    movies.setReleaseYear(sc.nextInt());
                    System.out.println("Add genre");
                    movies.setGenre(sc.next());
                    IMovie.addMovie(movies);
                }
                case 2 -> {
                    System.out.println("Enter the title");
                    String title = sc.next();
                    System.out.println(IMovie.removeMovie(title));
                }
                case 3 -> {
                    System.out.println("Enter the title");
                    String title = sc.nextLine();
                    System.out.println((IMovie.searchMovie(title)));
                }
                case 4 -> System.out.println(IMovie.displayAllMovies());
                case 5 -> IMovie.sortMoviesByTitle();
                case 0 -> System.out.println("BYE BYE");
            }
        }while (option!=0);
    }
}