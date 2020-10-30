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
public class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(String username){
        super("Username '" + username + "' is already registered.");
    }
}
