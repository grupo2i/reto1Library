package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception for email already in use.
 * @author Aitor Fidalgo
 */
public class EmailAlreadyExistsException extends Exception{
    public EmailAlreadyExistsException(String email){
        super("Email '" + email + "' is already registered.");
        Logger.getLogger(UnexpectedErrorException.class.getName()).log(Level.SEVERE, this.getMessage());
    }
}
