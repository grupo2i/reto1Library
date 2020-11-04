package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aitor
 */
public class PasswordDoesNotMatchException extends Exception{
    public PasswordDoesNotMatchException(){
        super("The password does not match.");
        Logger.getLogger(UnexpectedErrorException.class.getName()).log(Level.SEVERE, this.getMessage());
    }
}
