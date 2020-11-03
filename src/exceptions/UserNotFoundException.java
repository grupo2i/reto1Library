package exceptions;

/**
 *
 * @author aitor
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String username){
        super("The user '" + username + "' was not found in the database.");
    }
}
