package GamesUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfile {
    private JButton button1;
    private JPanel UserPannel;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JFrame userProfileFrame;

    private MainMenu mainMenuframe;

    public UserProfile(MainMenu mainMenuframe) {
        this.userProfileFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                userProfileFrame.setVisible(false);
            }
        });

    }

    public void displayMainFrame(){
        userProfileFrame.setContentPane(this.UserPannel);
        userProfileFrame.setSize(400,400);
        userProfileFrame.setVisible(true);
    }

    public JPanel getUserPannel() { return UserPannel; }



    // EOF
}
