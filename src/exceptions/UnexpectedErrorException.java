package exceptions;

/**
 *
 * @author aitor
 */
public class UnexpectedErrorException extends Exception{
    public UnexpectedErrorException(){
        super("An unexpected error occured, try later.");
    }
}
