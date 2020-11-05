package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception for user already existing.
 * @author Aitor Fidalgo
 */
public class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(String username){
        super("Username '" + username + "' is already registered.");
        Logger.getLogger(UnexpectedErrorException.class.getName()).log(Level.SEVERE, this.getMessage());
    }
}
