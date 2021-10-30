package Utilities;

import javax.swing.*;

public class User {
    // VARIABLES
    private String userName;
    public Icon userIcon;
    public static int userMoney = 0;

    // CONSTRUCTOR
    public User(String userName, Icon userIcon){
        this.userName = userName;
        this.userIcon = userIcon;
    }

    // METHODS
    public String getUserName(){ return this.userName; };
    public Icon getUserIcon(){ return this.userIcon; };
    public void setUserName (String Name) {this.userName = Name; };
    public void setUserIcon (Icon iconU) {this.userIcon = iconU; };

    public String ToString() {
        return getUserName() + getUserIcon();
    }

    // PUBLIC USER
    public static User casinoUser = new User(null,null);

    // EOF
}
