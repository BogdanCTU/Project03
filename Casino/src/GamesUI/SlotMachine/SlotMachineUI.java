package GamesUI.SlotMachine;

import GamesUI.MainMenu;
import Utilities.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotMachineUI {
    // UTILITIES
    private JPanel SlotMachinePannel;
    private JButton backMenuButton;
    private JButton userImageSM;
    private JLabel userLabelSM;
    private JButton refreshButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton bat50Button;
    private JPanel SlotMachineGamePannel;
    private JButton bet100Button;
    private JButton bet200Button;
    private JButton spinButton;

    private MainMenu mainMenuframe;
    private JFrame slotMachineFrame;

    // CONSTRUCTOR
    public SlotMachineUI(MainMenu mainMenuframe) {
        this.slotMachineFrame = new JFrame("Slot Machine Frame");
        this.mainMenuframe = mainMenuframe;

        backMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                slotMachineFrame.setVisible(false);
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(User.casinoUser.getUserName() != null) userLabelSM.setText("User: " + User.casinoUser.getUserName() + " / Currency: " + User.userMoney);
                if(User.casinoUser.getUserIcon() != null) userImageSM.setIcon(User.casinoUser.getUserIcon());
            }
        });






    }

    // METHODS
    public void displaySMFrame(){
        slotMachineFrame.setContentPane(this.SlotMachinePannel);
        slotMachineFrame.setSize(400,400);
        slotMachineFrame.setVisible(true);
    }

    public JPanel getSMPanel() { return SlotMachinePannel; }

    // EOF
}
