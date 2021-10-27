package GamesUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu implements ActionListener{
    public JFrame MainMenuJFrame = new JFrame("MainM");
    private JButton button1;
    private JPanel MainM;

    JFrame mainFrame = new JFrame("Main Frame");

    public MainMenu()
    {
        MainMenuJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenuJFrame.setSize(450,450);
        MainMenuJFrame.setContentPane(new MainMenu().MainM);
        MainMenuJFrame.setVisible(true);
        MainMenuJFrame.pack();
        MainMenuJFrame.setVisible(true);
        MainMenuJFrame.setResizable(false);
        MainMenuJFrame.add(MainM);



    }

    public void addComponents()
    {
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            UserProfile userProfileFrame = new UserProfile();
        }
    }





    /*
    public MainMenu(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserProfile().setVisible(true);

            }
        });
    }
     */


    //EOF
}
