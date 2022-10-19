package _jav.someting.serealization;

import java.io.Serializable;

public class user  implements Serializable{
    String name;
    String password;
    public void sayHeloo(){
        System.out.println("Hellow"+ name);
    }
}
