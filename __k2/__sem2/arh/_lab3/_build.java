package __k2.__sem2.arh._lab3;

public class _build implements Strategy {

    @Override
    public void type(String booking_type) {
       System.out.println("Build: " + booking_type);
    }

    @Override
    public void name(String name_of_booking) {
        System.out.println("Name: "+name_of_booking);
        ;
    }
    
}
