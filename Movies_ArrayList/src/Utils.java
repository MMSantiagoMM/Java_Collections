import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static Boolean minLetters(String name, Integer characters){
        return name.length() >= characters;
    }

    public static Boolean maxLetters(String field, Integer characters){
        return field.length() <= characters;
    }

    public static Boolean validateRegExp(String field,String regExp){
        Pattern pattern = Pattern.compile(regExp);
        Matcher validation = pattern.matcher(field);
        return validation.matches();
    }




}
