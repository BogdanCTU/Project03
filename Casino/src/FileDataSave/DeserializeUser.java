package FileDataSave;
import Utilities.User;

import java.io.*;

public class DeserializeUser {
    public static void deserializaUser () throws IOException {
        try {
            FileInputStream fileInput = new FileInputStream("C:\\Users\\bctod\\Desktop\\Proiect_03\\Casino\\src\\FileDataSave\\dataSave");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            User.casinoUser = (User)objectInput.readObject();
            objectInput.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
