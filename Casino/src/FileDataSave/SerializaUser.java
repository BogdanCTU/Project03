package FileDataSave;

import Utilities.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaUser {
    public static void serializaUser () throws IOException {
        try {
            FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\bctod\\Desktop\\Proiect_03\\Casino\\src\\FileDataSave\\dataSave");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            objectOutput.writeObject(User.casinoUser);
            objectOutput.close();
        } catch (Exception ex) {
        }
    }
}
