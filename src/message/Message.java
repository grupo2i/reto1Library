/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;

/**
 * Message object for Client/Server communication.
 * @author Martin Angulo
 */
public class Message implements Serializable {
    public enum Type{SIGN_IN, 
                     SIGN_UP, 
                     LOG_OFF,
                     CLOSE_CONNECTION}
    
    private Type type;
    private Object data;
    
    /**
     * Message constructor.
     * @param type Type of the message (from enum in this class).
     * @param data Object containing the data. Messages without data just pass null as second argument.
     */
    public Message(Type type, Object data) {
        this.data = data;
        this.type = type;
    }
    
    /**
     * @return The data object
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data The data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @return The type
     */
    public Type getType() {
        return type;
    }

    /**
     * @param type The type to set
     */
    public void setType(Type type) {
        this.type = type;
    }
}