package __k2.__sem2.arh._lab3;

public class _hotel_room implements Strategy {
    @Override
    public void type(String booking_type) {
       System.out.println("Hotel: "+booking_type);
    }
    @Override
    public void name(String name_of_booking) {
        System.out.println("Name: "+name_of_booking);
    } 
}
