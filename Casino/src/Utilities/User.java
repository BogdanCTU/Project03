package Utilities;

import javax.swing.*;

public class User {
    // VARIABLES
    private String userName;
    private Icon userIcon;
    public static int userMoney;

    // CONSTRUCTOR
    public User(String userName, Icon userIcon){
        this.userName = userName;
        this.userIcon = userIcon;
    }

    // METHODS
    public String getUserName(){ return this.userName; };
    public Icon getUserIcon(){ return this.userIcon; };

    public String ToString() {
        return getUserName() + getUserIcon();
    }

    // EOF
}
