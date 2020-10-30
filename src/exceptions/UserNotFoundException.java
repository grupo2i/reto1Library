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
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String username){
        super("The user '" + username + "' was not found in the database.");
    }
}
