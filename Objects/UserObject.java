package Objects;

/*
 * Object for the user and their information.
 *
 * @authors: Will Higdon, Quinn Tjin-A-Soe | Modified: Fernando Villarreal
 * Last Updated: April 9, 2020
 */

public class UserObject extends RecordObject {
    /*
     * String variables for all of the user's information.
     */
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userFirstName;
    private String userLastName;

    //=================  CONSTRUCTORS ==================

    public UserObject(String _name, int _id, String _userName, String _userPassword, String _userEmail, String _userFirstName, String _userLastName) {
        super(_name, _id);
        this.userName = _userName;
        this.userPassword = _userPassword;
        this.userEmail = _userEmail;
        this.userFirstName = _userFirstName;
        this.userLastName = _userLastName;
    }

    public UserObject(String _uuid, String _name, int _id, String _userName, String _userPassword, String _userEmail, String _userFirstName, String _userLastName) {
        super(_uuid, _name, _id);
        this.userName = _userName;
        this.userPassword = _userPassword;
        this.userEmail = _userEmail;
        this.userFirstName = _userFirstName;
        this.userLastName = _userLastName;
    }

    //================= METHODS =================

    @Override
    public String toString() {
        String userInfo = super.toString() + "\nUsername: " + this.userName + "\nPassword: " + this.userPassword
                + "\nEmail: " + this.userEmail + "\nFirst Name: " + this.userFirstName + "\nLast Name: " + this.userLastName;
        return userInfo;
    }

    //=================  GETTERS ==================

    public String getUserName() {
        return this.userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public String getUserFirstName() {
        return this.userFirstName;
    }

    public String getUserLastName() {
        return this.userLastName;
    }

    //=================  SETTERS =================

    public void setUserName(String _userName) {
        this.userName = _userName;
    }

    public void setUserPassword(String _userPassword) {
        this.userPassword = _userPassword;
    }

    public void setUserEmail(String _userEmail) {
        this.userEmail = _userEmail;
    }

    public void setUserFirstName(String _userFirstName) {
        this.userFirstName = _userFirstName;
    }

    public void setUserLastName(String _userLastName) {
        this.userLastName = _userLastName;
    }
}
