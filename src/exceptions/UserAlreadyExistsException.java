package exceptions;

/**
 *
 * @author aitor
 */
public class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(String username){
        super("Username '" + username + "' is already registered.");
    }
}
