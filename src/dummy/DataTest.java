/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummy;

import java.io.Serializable;

/**
 * Dummy data class for Message testing purposes.
 * @author Martin Angulo
 */
public class DataTest implements Serializable {
    private Integer num;
    private String msg;
    
    /**
     * DataTest constructor.
     * @param num A number
     * @param msg A string containing a message.
     */
    public DataTest(Integer num, String msg) {
        this.num = num;
        this.msg = msg;
    }

    /**
     * @return the num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
}