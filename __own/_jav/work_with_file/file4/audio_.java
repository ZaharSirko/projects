package __own._jav.work_with_file.file4;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;


public class audio_ {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        try (Scanner scanner = new Scanner(System.in)) {
            File file = new File("Glimpsing-Infinity-Asher-Fulero.wav");
            
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            Clip clip =AudioSystem.getClip();

            clip.open(audioStream);



            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = play; Q = quit; R =restart; S = stop");
                System.out.print("Enter symbol: ");

               response = scanner.next();
  
                response = response.toUpperCase();


                switch(response){
                    case ("P"): clip.start();
                    break;
                    case("S"): clip.stop();
                    break;
                    case("R"): clip.setMicrosecondPosition(0);
                    break;
                    case("Q"): clip.close();
                    break;
                    default: System.out.println("Enter right symbol");
                }
            
            }
        }
        
    }
}
