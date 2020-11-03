package exceptions;

/**
 *
 * @author aitor
 */
public class EmailAlreadyExistsException extends Exception{
    public EmailAlreadyExistsException(String email){
        super("Email '" + email + "' is already registered.");
    }
}
