package __k2.__sem2.arh.lab1;

import java.util.ArrayList;
import java.util.List;

public class railway {
    String name;
    List<String> booking = new ArrayList();
    
    @Override
    public String toString() {
        return name +"\n"+booking;
    }
}
