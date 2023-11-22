package __k3.sec;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class lab2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        String fileName = "D://Microsoft VS Code//projects//__k3//sec//Файл.txt:АльтернативнийПотік";
        try {
            FileInputStream file = new FileInputStream(fileName);
            FileChannel channel = file.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(4);
            int bytesRead = channel.read(buffer);
            int random_number = new Random().nextInt(10);
            System.out.println(random_number);
            System.out.print("Enter number "); // 42
            Scanner scanner = new Scanner(System.in);
            int pass = scanner.nextInt();
            if (bytesRead == 4) { 
                buffer.flip(); 
                int numericValue = buffer.getInt();
                if(pass==random_number+numericValue)    System.out.println("Password correct");
                else System.out.println("Password isn`t correct");
            } else {
                System.out.println("Alt channel haven`t int number.");
            }
            file.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
