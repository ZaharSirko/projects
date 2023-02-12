package _jav.something.deserializer;
import java.io.*;
public class __desrial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        user user = null;
        FileInputStream  fileIn  = new FileInputStream("D:\\Microsoft VS Code\\projects\\UsetInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (user) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }    
}
