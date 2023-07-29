package __k2.__sem2.arh._lab4;

public class train implements railway {
    @Override
    public void type(String vehicle_type) {
       System.out.println("Train: " + vehicle_type);
    }
    @Override
    public void name(String name) {
        System.out.println("Name: "+name);
    }
}
