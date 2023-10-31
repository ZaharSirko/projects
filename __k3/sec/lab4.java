import java.util.prefs.Preferences;

public class lab4 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("k3/sec");
        String storedComputerName = prefs.get("computerName", null);
        String computerNames = System.getenv("COMPUTERNAME");
        if (storedComputerName == null) {
            prefs.put("computerName", computerNames);
            System.out.println("Enter");} else
         if (storedComputerName.equals(computerNames)) {
            System.out.println("Enter");
        } else {
            System.out.println("Erorr");
    
        }
    }
}


