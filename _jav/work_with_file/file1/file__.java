package _jav.work_with_file.file1;
import java.io.File;
public class file__ {

 public static void main(String[] args) {
  
  // file = An abstract representation of file and directory pathnames
  
  File file = new File("D:\\Microsoft VS Code\\projects\\work_with_file\\file1\\qwe.txt");
  //File file2 = new File("asd.txt");
  
  if(file.exists()) {
   System.out.println("That file exists! :O!");
   System.out.println(file.getPath());
   System.out.println(file.getAbsolutePath());
   System.out.println(file.isFile());
   file.delete();
  }
  else {
   System.out.println("That file doesn't exist :(");
  }  
 }
}
