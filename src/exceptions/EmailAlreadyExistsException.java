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
public class EmailAlreadyExistsException extends Exception{
    public EmailAlreadyExistsException(String email){
        super("Email '" + email + "' is already registered.");
    }
}
