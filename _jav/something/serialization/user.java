package _jav.something.serialization;

import java.io.Serializable;

public class user  implements Serializable{
    String name;
    String password;
    public void sayHello(){
        System.out.println("Hellow"+ name);
    }
}
