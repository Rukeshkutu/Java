package ExceptionHandling.CustomException;

public class AgeInvalidException extends Exception{
    AgeInvalidException(String s){
        super(s);
    }
}
