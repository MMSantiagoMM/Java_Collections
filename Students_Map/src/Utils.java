import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    static boolean validateRegExpression(String value, String regExp){
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }





}
