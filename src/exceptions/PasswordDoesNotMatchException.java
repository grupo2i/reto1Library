package exceptions;

/**
 *
 * @author aitor
 */
public class PasswordDoesNotMatchException extends Exception{
    public PasswordDoesNotMatchException(){
        super("The password does not match.");
    }
}
