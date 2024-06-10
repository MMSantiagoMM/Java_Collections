public class Movie {

    private String title;

    private String genre;

    private Integer year;

    public Movie() {
    }

    public Movie(String title, String genre, String year) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setYear(year);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        try{
            Validation.validateTitle(title);
            this.title = title;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        try{
            Validation.validateGender(genre);
            this.genre = genre;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public Integer getYear() {
        return year;
    }

    public void setYear(String year) {
        try {
            this.year = Validation.validateYear(year);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
