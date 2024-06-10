

public class Validation {

    public static Boolean validateGender(String genre) throws Exception {
        
        if(!Utils.maxLetters(genre,20)){
            throw new InvalidGenre("Number os characters invalid");

        }
        if (!Utils.validateRegExp(genre,"^[ a-zA-Z]+$")) {
            throw new InvalidGenre("This genre is invalid, enter only letters");
        }
        return true;
    }

    public static Boolean validateTitle(String title){
        if(!Utils.maxLetters(title,20)){
            throw new InvalidGenre("Number of characters invalid to title");
        }
        return true;
    }

    public static Integer validateYear(String year){
        if(!Utils.validateRegExp(year,"^\\d+$")){
            throw new InvalidGenre("Only numbers are accepted");
        }
        return Integer.valueOf(year);
    }









}
