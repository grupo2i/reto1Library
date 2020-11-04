package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aitor
 */
public class UnexpectedErrorException extends Exception{
    public UnexpectedErrorException(String exceptionMessage){
        Logger.getLogger(UnexpectedErrorException.class.getName()).log(Level.SEVERE, exceptionMessage);
    }
}
