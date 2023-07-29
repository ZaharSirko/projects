package __k2.__sem2.arh._lab5;

public class locomative implements Strategy {
    @Override
    public void type(String vehicle_type) {
       System.out.println("Locomative: "+vehicle_type);
    }
    @Override
    public void name(String name) {
        System.out.println("Name: "+name);
    } 
}
