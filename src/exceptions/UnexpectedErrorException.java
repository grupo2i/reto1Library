package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exception for unexpected error.
 * @author Aitor Fidalgo
 */
public class UnexpectedErrorException extends Exception{
    public UnexpectedErrorException(String exceptionMessage){
        super("No response from server.");
        Logger.getLogger(UnexpectedErrorException.class.getName()).log(Level.SEVERE, exceptionMessage);
    }
}
