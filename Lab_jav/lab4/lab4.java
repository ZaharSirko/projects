package Lab_jav.lab4;
import java.util.Arrays;

public class lab4 {
    public static void main(String[] args) throws CloneNotSupportedException {

        _abstract l = new _abstract(){
            @Override
            void show_composition() {
              System.out.println("1");
              }
              @Override
              public String toString() {
                  return "hellow";
            }
            @Override
            public boolean equals(Object _abstrac) {
                return super.equals(_abstrac);
            }
        };
        _abstract  l2 = new _abstract(){
            @Override
            void show_composition() {
                System.out.println("2");
            }
            @Override
            public String toString() {
                return "hi";
            }
        };
        _abstract  l3 = new _abstract(){
            @Override
            void show_composition() {
                System.out.println("3");
            }
            @Override
            public String toString() {
                return "q";}
        };


        System.out.println(l.equals(l2));

       System.out.println(l.toString());   
       System.out.println(l2.toString());   
       System.out.println(l3.toString());   


        _abstract refAbs;

        refAbs = l;
        refAbs.show_composition();

        refAbs = l2;
        refAbs.show_composition();

        refAbs = l3;
        refAbs.show_composition();
        
        _abstract.count();


        composition composition1= new composition("Beethoven Moonlight 1st", 6.00, 1827, "Ludwig van Beethoven");
        composition1.show_composition();

        composition composition2 = new composition("Requiem, K. 626: III. Sequenz - 1. Dies irae",2,1791,"Wolfgang Amadeus Mozart");
        System.out.println(composition2.toString());
        System.out.println(composition1.equal(composition2));
        composition2.clap();

        authors mozart = authors.valueOf("MOZART");
        System.out.println(mozart.getName());
        System.out.println(Arrays.toString(authors.values()));

        composition clone = (composition) composition1.clone();
        System.out.println(clone);

        System.out.println(composition1.compareTo(composition2));  
    }

}