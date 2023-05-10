package __k2.__sem2.arh._lab1;

import java.util.ArrayList;
import java.util.List;

public class _composition {
    String name;
    List<String> compos = new ArrayList();
    
    @Override
    public String toString() {
        return name +"\n"+compos;
    }
}
