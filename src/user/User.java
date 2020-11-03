package user;

import java.io.Serializable;
import java.sql.Date;

/**
 * User class that contains the user data.
 * @author aitor
 */
public class User implements Serializable{
    public enum UserStatus{
        ENABLED,
        DISABLED
    }
    public enum UserPrivilege{
        USER,
        ADMIN
    }
    
    private Integer id;
    private String login;
    private String email;
    private String fullName;
    private String password;
    
    private UserStatus status;
    private UserPrivilege privilege;
    
    private Date lastAccess;
    private Date lastPasswordChange;

    public User() {   
    }
    
    /**
     * Full user constructor.
     * @param id Id of the user.
     * @param login Login of the user.
     * @param email Email of the user.
     * @param fullName Full name of the user.
     * @param password Password of the user.
     * @param status Status of the user.
     * @param privilege Privilege status of the user.
     * @param lastAccess Last access date of the user.
     * @param lastPasswordChange Last password date change of the user.
     */
    public User(Integer id, String login, String email, String fullName, String password, 
                UserStatus status, UserPrivilege privilege, Date lastAccess, Date lastPasswordChange) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.status = status;
        this.privilege = privilege;
        this.lastAccess = lastAccess;
        this.lastPasswordChange = lastPasswordChange;
        
    }
    
    //Getter methods...
    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return The login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return The full name
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @return The password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return The status
     */
    public UserStatus getStatus() {
        return status;
    }

    /**
     * @return The privilege
     */
    public UserPrivilege getPrivilege() {
        return privilege;
    }

    /**
     * @return The last access date
     */
    public Date getLastAccess() {
        return lastAccess;
    }

    /**
     * @return The last password change date
     */
    public Date getLastPasswordChange() {
        return lastPasswordChange;
    }
    
    //Setter methods...
    /**
     * @param id The id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @param login The login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @param email The email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param fullName The full name to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @param password The password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param status The status to set
     */
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    /**
     * @param privilege The privilege to set
     */
    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

    /**
     * @param lastAccess The date of the last access.
     */
    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    /**
     * @param lastPasswordChange The date of the last password change.
     */
    public void setLastPasswordChange(Date lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
    
    /**
     * Helper function to print all user data.
     */
    public void printData() {        
        System.out.println("Id: " + id);
        System.out.println("Login: " + login);
        System.out.println("Email: " + email);
        System.out.println("Full Name: " + fullName);
        System.out.println("Password: " + password);
        System.out.println("Status: " + status);
        System.out.println("Privilege: " + privilege);
        System.out.println("Last Access: " + lastAccess);
        System.out.println("Last Password Change: " + lastPasswordChange);
    }
}
