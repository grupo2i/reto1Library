package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aitor
 */
public class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(String username){
        super("Username '" + username + "' is already registered.");
        Logger.getLogger(UnexpectedErrorException.class.getName()).log(Level.SEVERE, this.getMessage());
    }
}
