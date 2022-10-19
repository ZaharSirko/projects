package Lab_jav.lab2;

public class lab2 {
    public static void main(String[] args) {
        composition composition1= new composition("Beethoven Moonlight 1st", 6.00, 1827, "Ludwig van Beethoven");
        composition1.show_composition();

        composition composition2 = new composition();
        composition2.setAuthor("Wolfgang Amadeus Mozart");
        composition2.setName("Requiem, K. 626: III. Sequenz - 1. Dies irae");
        composition2.setYear(1791);
        composition2.setDuring(2);
        System.out.println( composition2.getName()+" "+composition2.getDuring()+" "+composition2.getYear()+" "+composition2.getAuthor());
        System.out.println("Number of composition "+ composition.numberOfComposition);

        composition[] collection = {composition1,composition2};
        System.out.println(collection[0].getName()+" "+collection[0].getDuring()+" "+collection[0].getYear()+" "+collection[0].getAuthor());
        System.out.println(collection[1].getName()+" "+collection[1].getDuring()+" "+collection[1].getYear()+" "+collection[1].getAuthor());
        
    }
 
}
