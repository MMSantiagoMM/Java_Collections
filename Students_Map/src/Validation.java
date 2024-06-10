public class Validation {

    static boolean validateName(String name) throws Exception {
        if(!Utils.validateRegExpression(name,"^[ a-zA-Z._%+-]+$")){
            throw new Exception("This name must not have numbers or special characters");
        }
        return true;
    }

    static boolean validateGrade(String grade) throws Exception {
        if(!Utils.validateRegExpression(grade,"^[0-9.]+$")){
            throw new Exception("This field just accepts numbers");
        }else {
            return true;
        }
    }





}
