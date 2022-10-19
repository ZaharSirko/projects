package _jav.base;
import java.util.ArrayList;

public class for__each_____ {
    public static void main(String[] args){

//String[] animals = {"cat","dog","cow"};

ArrayList<String> animals = new ArrayList<String>();

animals.add("cow");
animals.add("dog");
animals.add("cat");

for(String i : animals){
    System.out.println(i);
}

    }
}
