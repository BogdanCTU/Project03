package GamesUI.Game_4;

import GamesUI.Game_4.DiceGame.RollDicePanel;
import GamesUI.MainMenu;
import Utilities.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game_4UI {
    // UTILITIES
    private JPanel Game4Pannel;
    private JButton backMenuButton;
    private JButton UserImageG4;
    private JButton refreshButton;
    private JLabel UserLabelG4;
    private JButton playGameButton;

    private MainMenu mainMenuframe;
    private JFrame game_4Frame;

    // CONSTRUCTOR
    public Game_4UI(MainMenu mainMenuframe) {
        this.game_4Frame = new JFrame("Game 4 Frame");
        this.mainMenuframe = mainMenuframe;

        backMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                game_4Frame.setVisible(false);
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(User.casinoUser.getUserName() != null) UserLabelG4.setText("User: " + User.casinoUser.getUserName() + " / Currency: " + User.userMoney);
                if(User.casinoUser.getUserIcon() != null) UserImageG4.setIcon(User.casinoUser.getUserIcon());
            }
        });

        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mainMenuJFrame.setVisible(false);     //TODO need back button

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new RollDicePanel();
                    }
                });
            }
        });






    }

    // METHODS
    public void displayG4Frame(){
        game_4Frame.setContentPane(this.Game4Pannel);
        game_4Frame.setSize(400,400);
        game_4Frame.setVisible(true);
    }

    public JPanel getSMPanel() { return Game4Pannel; }

    // EOF
}
