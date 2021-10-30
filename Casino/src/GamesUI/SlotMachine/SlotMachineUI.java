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
    private JButton line_1_1;
    private JButton line_1_2;
    private JButton line_1_3;
    private JButton line_2_1;
    private JButton line_2_2;
    private JButton line_2_3;
    private JButton line_3_1;
    private JButton line_3_2;
    private JButton line_3_3;
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
        slotMachineFrame.setSize(400,500);
        slotMachineFrame.setVisible(true);
    }

    public JPanel getSMPanel() { return SlotMachinePannel; }

    // EOF
}
