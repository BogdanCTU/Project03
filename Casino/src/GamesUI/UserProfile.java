package GamesUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfile extends JFrame{
    private JButton button1;
    private JPanel UserPannel;

    JFrame userFrame = new JFrame("LoginFrame");

    public UserProfile(){
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userFrame.setSize(450,450);
        userFrame.setContentPane(new UserProfile().UserPannel);
        userFrame.add(UserPannel);
        userFrame.setVisible(true);
        userFrame.pack();
        userFrame.setVisible(true);
        userFrame.setResizable(false);

    }



    /*
    public UserProfile(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu().setVisible(true);

            }
        });
    }
     */

    // EOF
}
