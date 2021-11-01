package GamesUI.HorseRacing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RaceResults extends JFrame{
    private JPanel HRResults;
    private JButton backButton;
    private HorseRacingUI horseRacingForm;
    private JFrame hrResults;

    public RaceResults(HorseRacingUI horseRacingForm) {
        this.hrResults = new JFrame("Reulsts");
        this.hrResults.setVisible(false);
        this.horseRacingForm = horseRacingForm;

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hrResults.setVisible(false);
                horseRacingForm.displayHRFrame();
            }
        });
    }
    public void displayResultsFrame(){
        hrResults.setContentPane(this.HRResults);
        hrResults.setExtendedState(JFrame.MAXIMIZED_BOTH);
        hrResults.setResizable(false);
        // hrInfoFrame.setSize(400,400);
        hrResults.setVisible(true);
    }
}
