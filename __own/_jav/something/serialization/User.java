package __own._jav.something.serialization;

import java.io.Serializable;

public class User  implements Serializable{
    String name;
   transient String password;
    public void sayHello(){
        System.out.println("Hellow"+ name);
    }
}
