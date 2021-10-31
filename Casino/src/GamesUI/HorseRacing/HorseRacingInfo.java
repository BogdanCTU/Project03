package GamesUI.HorseRacing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HorseRacingInfo extends JFrame{

    private JPanel infoPane;
    private JButton backButton;
    private JLabel normalInfo;
    private HorseRacingUI horseRacingForm;
    private JFrame hrInfoFrame;
    public HorseRacingInfo(HorseRacingUI horseRacingForm){
        this.hrInfoFrame=new JFrame("Info");
        this.hrInfoFrame.setVisible(false);
        this.horseRacingForm=horseRacingForm;

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                horseRacingForm.displayHRFrame();
                hrInfoFrame.setVisible(false);
            }
        });
    }
    //functia pentru display
    public void displayHsInfoFrame(){
        hrInfoFrame.setContentPane(this.infoPane);
        hrInfoFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        hrInfoFrame.setResizable(false);
        // hrInfoFrame.setSize(400,400);
        hrInfoFrame.setVisible(true);
    }
}
