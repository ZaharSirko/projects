package __k2.__sem2.arh._lab2;

import java.util.ArrayList;
import java.util.List;

public class _types implements booking {
   private List <booking> bookings = new ArrayList<booking>();

@Override
public void type(String booking_type) {
     for (booking _booking : bookings) {
        _booking.type(booking_type);
     }
}

@Override
public void name(String name_of_booking) {
  for (booking _booking : bookings) {
    _booking.name(name_of_booking);
  }
}

public void add(booking value){
   this.bookings.add(value);
}

public void clear(){
   System.out.println();
   this.bookings.clear();
}
    
    
}
