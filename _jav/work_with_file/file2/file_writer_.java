package _jav.work_with_file.file2;

import java.io.FileWriter;

public class file_writer_ {
    public static void main(String[] args) {
        
    
    try {
        FileWriter writer = new FileWriter("D:\\Microsoft VS Code\\projects\\work_with_file\\file2\\qwe.txt");
        writer.write("Cat is white \nDog is brown\nCat 2 is Black ");
        writer.append("\nTo end of txt");
        writer.close();
    } catch (Exception e) {
        
        e.printStackTrace();
    }

    }

}
