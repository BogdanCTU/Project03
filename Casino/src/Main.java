import GamesUI.*;
import Utilities.*;
import FileDataSave.*;

import java.io.IOException;

public class Main {
    // UTILITIES
    private final MainMenu mainMenuFrame;

    // CONSTRUCTOR
    public Main() {
        this.mainMenuFrame = new MainMenu();
    }

    // MAIN PROGRAM
    public static void main(String[] args) throws IOException {
        if(User.casinoUser.getUserIcon() == null && User.casinoUser.getUserName() == null) DeserializeUser.deserializaUser();

        Main program = new Main();
        program.mainMenuFrame.displayMainFrame();

    }

    //EOF
}
