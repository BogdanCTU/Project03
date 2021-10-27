// Tarca Silviu

package GamesUI.HorseRacing;

import GamesUI.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HorseRacingUI {
    // UTILITIES
    private JButton backMenuButton;
    private JPanel HRPanel;
    private JFrame userProfileFrame;

    private MainMenu mainMenuframe;

    // CONSTRUCTOR
    public HorseRacingUI(MainMenu mainMenuframe) {
        this.userProfileFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;

        backMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                userProfileFrame.setVisible(false);
            }
        });

    }

    // METHODS
    public void displayMainFrame(){
        userProfileFrame.setContentPane(this.HRPanel);
        userProfileFrame.setSize(400,400);
        userProfileFrame.setVisible(true);
    }

    public JPanel getUserPannel() { return HRPanel; }

    //EOF - end of file
}
