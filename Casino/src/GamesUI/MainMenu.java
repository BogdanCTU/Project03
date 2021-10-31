package GamesUI;

import GamesUI.FortuneWheel.FortuneWheelUI;
import GamesUI.HorseRacing.HorseRacingUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    public JFrame mainMenuJFrame;
    private JButton button1;
    private JPanel MainM;
    private JButton game3Button;
    private JButton game2Button;
    private JButton game4Button;
    private JButton game1Button;

    private UserProfile userProfileForm;
    private HorseRacingUI horseRacingForm;
    private FortuneWheelUI fortuneWheelForm;

    public MainMenu() {
        this.mainMenuJFrame = new JFrame("Main Frame");
        this.userProfileForm = new UserProfile(this);
        this.horseRacingForm = new HorseRacingUI(this);
        this.fortuneWheelForm = new FortuneWheelUI(this);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userProfileForm.displayMainFrame();
                mainMenuJFrame.setVisible(false);

            }
        });

        game1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                horseRacingForm.displayHRFrame();
                mainMenuJFrame.setVisible(false);

            }
        });

        game2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fortuneWheelForm.displayFWFrame();
                mainMenuJFrame.setVisible(false);

            }
        });


    }

    public void displayMainFrame(){
        mainMenuJFrame.setContentPane(this.MainM);
        mainMenuJFrame.setSize(400,400);
        mainMenuJFrame.setVisible(true);
    }

    public JPanel getMainPanel() { return MainM; }



    //EOF
}
