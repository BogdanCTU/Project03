package Utilities;

import javax.swing.*;
import java.io.Serializable;

public class User implements Serializable {
    // VARIABLES
    private String userName;
    public Icon userIcon;
    private int money = 0;
    public static int userMoney = 0;

    // CONSTRUCTOR
    public User(String userName, Icon userIcon, int money){
        this.userName = userName;
        this.userIcon = userIcon;
        this.money = money;
    }

    // METHODS
    public String getUserName(){ return this.userName; };
    public Icon getUserIcon(){ return this.userIcon; };
    public int GetUserMoneyLast(){ return this.money; };
    public void setUserName (String Name) {this.userName = Name; };
    public void setUserIcon (Icon iconU) {this.userIcon = iconU; };
    public void setUserMoeny (int moneyU) {this.money = moneyU; };

    public String ToString() {
        return getUserName() + getUserIcon();
    }

    // PUBLIC USER
    public static User casinoUser = new User(null,null, 0);

    // EOF
}
