package __own._jav.something.serialization;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;

public class ___seril {
    public static void main(String[] args) throws IOException  {
        User user = new User();
        user.name= "Zahar";
        user.password = "asd123";
       
        FileOutputStream fileOut = new FileOutputStream("UsetInfo.ser");

        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Saved");
    }
}
