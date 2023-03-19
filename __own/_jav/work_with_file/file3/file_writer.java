package __own._jav.work_with_file.file3;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;

public class file_writer {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("D:\\Microsoft VS Code\\projects\\work_with_file\\file3\\qwe.txt");
            int data = reader.read();

            while(data!=-1){
            System.out.print((char)data);
            data = reader.read();
            }
            reader.close();
        }catch (FileNotFoundException a) {
            a.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    }

