/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
