package __k2.__sem1.Lab_jav.lab4;

public abstract class _abstract {
    abstract void show_composition();
    static private int number;
    static public void count(){
       System.out.println(_abstract.number);
    }
    public void clap (){
        System.out.println("Composition end, Clap-Clap-Clap");
    } 
    _abstract(){
     number++;
    }
}