package GamesUI;

import GamesUI.FortuneWheel.FortuneWheelUI;
import GamesUI.Game_4.DiceGame.RollDicePanel;
import GamesUI.Game_4.Game_4UI;
import GamesUI.HorseRacing.HorseRacingUI;
import GamesUI.SlotMachine.SlotMachineUI;
import Utilities.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    // VARIABLES
    public JFrame mainMenuJFrame;
    private JButton button1;
    private JPanel MainM;
    private JButton game3Button;
    private JButton game2Button;
    private JButton game4Button;
    private JButton game1Button;
    private JButton menuUserImageButton;
    private JLabel userLabelMenu;
    private JButton refreshButton;

    private final UserProfile userProfileForm;
    private final HorseRacingUI horseRacingForm;
    private final FortuneWheelUI fortuneWheelForm;
    private final SlotMachineUI slotMachineForm;
    private final Game_4UI game_4Form;

    public MainMenu() {
        this.mainMenuJFrame = new JFrame("Main Frame");
        this.userProfileForm = new UserProfile(this);
        this.horseRacingForm = new HorseRacingUI(this);
        this.fortuneWheelForm = new FortuneWheelUI(this);
        this.slotMachineForm = new SlotMachineUI(this);
        this.game_4Form = new Game_4UI(this);

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

                //SwingUtilities.invokeLater(new Runnable() {
                  //  @Override
                  //  public void run() {
                      //  new Frame();
                  //  }
                //});
            }
        });

        game3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slotMachineForm.displaySMFrame();
                mainMenuJFrame.setVisible(false);
            }
        });

        game4Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                game_4Form.displayG4Frame();
                mainMenuJFrame.setVisible(false);
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(User.casinoUser.getUserName() != null) userLabelMenu.setText("User: " + User.casinoUser.getUserName() + " / Currency: " + User.userMoney);
                if(User.casinoUser.getUserIcon() != null) menuUserImageButton.setIcon(User.casinoUser.getUserIcon());
            }
        });

    }

    // FRAMES METHODS
    public void displayMainFrame(){
        mainMenuJFrame.setContentPane(this.MainM);
        mainMenuJFrame.setSize(500,450);
        mainMenuJFrame.setVisible(true);
    }

    // METHODS
    public JPanel getMainPanel() { return MainM; }

    //EOF
}
