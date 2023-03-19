package __own._jav.something.deserializer;
import java.io.*;
public class __desrial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      
        User user = null;
        FileInputStream fileIn;
		try {
			fileIn = new FileInputStream("D:\\Microsoft VS Code\\projects\\UsetInfo.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         user = (User) in.readObject();
	         in.close();
	         fileIn.close();
	      
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println(user.name);  
        System.out.println(user.password);
        user.sayHello();
    }    
}
