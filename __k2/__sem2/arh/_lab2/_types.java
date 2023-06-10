package __k2.__sem2.arh._lab2;

import java.util.ArrayList;
import java.util.List;

public class _types implements railway {
   private List <railway> vehicle = new ArrayList<railway>();
@Override
public void type(String vehicle_type) {
     for (railway _booking : vehicle) {
        _booking.type(vehicle_type);
     }
}
@Override
public void name(String name) {
  for (railway _booking : vehicle) {
    _booking.name(name);
  }
}
public void add(railway value){
   this.vehicle.add(value);
}
public void clear(){
   System.out.println();
   this.vehicle.clear();
}
}
