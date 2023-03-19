package __k2.__sem1.Lab_jav.lab8;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task2 {
    public static void main(String[] args) {
        color("#FFFFFF");
    }
    public static void color (String word) {
        Pattern pattern = Pattern.compile("#(([a-zA-Z\\d\\u002E]){6})");
        Matcher matcher = pattern.matcher (word);
        System.out.println (word + (matcher.matches()? " Passed": " Not passed"));
        }
}
