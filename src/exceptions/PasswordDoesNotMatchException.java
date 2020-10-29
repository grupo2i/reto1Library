/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import user.User;

/**
 *
 * @author aitor
 */
public class PasswordDoesNotMatchException extends Exception{
    public PasswordDoesNotMatchException(User user){
        super("The user '" + user.getLogin() + "' does not match with the password.");
    }
}
