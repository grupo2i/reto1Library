package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * exception for user not found
 * @author aitor
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String username){
        super("The user '" + username + "' was not found in the database.");
        Logger.getLogger(UnexpectedErrorException.class.getName()).log(Level.SEVERE, this.getMessage());
    }
}
