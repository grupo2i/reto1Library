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
public class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(User user){
        super("Username '" + user.getLogin() + "' is already registered.");
    }
}
