package GamesUI;

import Utilities.User;
import GamesUI.MainMenu;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfile {
    private JButton backButton;
    private JPanel UserPannel;
    private JPanel UserSettingsPannel;
    private JPanel UserImagesPannel;
    private JButton image_1_Button;
    private JButton image_3_Button;
    private JButton saveImageButton;
    private JButton image_2_Button;
    private JButton image_4_Button;
    private JPanel UserPannelFinal;
    private JTextField nameTextField;
    private JButton selectImageButton;
    private JButton UserImageFinal;
    private JButton editProfileButton;
    private JLabel userMoneyLabel;
    private JLabel userNameLabel;
    private JButton saveUserButton;
    private JButton userSavedImage;
    private JFrame userProfileFrame;

    private MainMenu mainMenuframe;

    public UserProfile(MainMenu mainMenuframe) {
        this.userProfileFrame = new JFrame("User Frame");
        this.mainMenuframe = mainMenuframe;

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenuframe.displayMainFrame();
                userProfileFrame.setVisible(false);
                //MainMenu.userNameLabelMenu.setText("User: " + User.casinoUser.getUserName());
            }
        });

        saveUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this pannel
                UserSettingsPannel.setVisible(false);
                User.casinoUser.setUserName(nameTextField.getText());
                User.casinoUser.setUserIcon(userSavedImage.getIcon());

                //other pannel
                UserPannelFinal.setVisible(true);
                userNameLabel.setText("User name: " + User.casinoUser.getUserName());
                userMoneyLabel.setText("User name: " + User.userMoney);
                UserImageFinal.setIcon(User.casinoUser.getUserIcon());
            }
        });

        editProfileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserSettingsPannel.setVisible(true);
                UserPannelFinal.setVisible(false);
            }
        });

        image_1_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this pannel
                userSavedImage.setIcon(image_1_Button.getIcon());
            }
        });

        image_2_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this pannel
                userSavedImage.setIcon(image_2_Button.getIcon());
            }
        });

        image_3_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this pannel
                userSavedImage.setIcon(image_3_Button.getIcon());
            }
        });

        image_4_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //this pannel
                userSavedImage.setIcon(image_4_Button.getIcon());
            }
        });

        saveImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserImagesPannel.setVisible(false);
                UserSettingsPannel.setVisible(true);
            }
        });

        selectImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserImagesPannel.setVisible(true);
                UserSettingsPannel.setVisible(false);
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
