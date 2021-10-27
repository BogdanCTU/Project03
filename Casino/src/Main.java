import GamesUI.*;

public class Main {
    // UTILITIES
    private MainMenu mainMenuFrame;

    // CONSTRUCTOR
    public Main() {
        this.mainMenuFrame = new MainMenu();
    }

    // MAIN PROGRAM
    public static void main(String[] args)
    {
        Main program = new Main();
        program.mainMenuFrame.displayMainFrame();



    }

    //EOF
}
