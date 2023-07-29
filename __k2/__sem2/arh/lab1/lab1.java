package __k2.__sem2.arh.lab1;

public class lab1 {
    public static void main(String[] args) {
        Tclass <String> asd = new Tclass<>();
        asd.setX("Train"); 
        asd.setY("Locomative");
        asd.spawp(asd.getValueX(), asd.getValueY());
        System.out.println("swap: "+ asd.getValueY() +"  -default Locomative");
        System.out.println("max element: "+asd.getMaxElement());
        System.out.println("min element: "+asd.getMinElement());
       
        System.out.println("-----------------");
        Tarray<String> tarray = new Tarray<>(2);
        tarray.add("Train");
        tarray.add("Locomative");
        tarray.delete("Locomative");
        tarray.sort();
        System.out.println("max element: "+tarray.getMaxElement());
        tarray.printTArr();

        System.out.println("-----------------");
        String[] Vehecle = {"Train","Locomative"};
        Tarray<String> tarray2 = new Tarray<>(Vehecle);
        tarray2.printTArr();
        System.out.println("max element: "+tarray2.getMaxElement());
    }
}
