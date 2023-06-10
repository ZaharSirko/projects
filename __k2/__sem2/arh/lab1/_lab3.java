package __k2.__sem2.arh.lab1;

public class _lab3 {
    public static void main(String[] args) {
        railway_factory myHotelRoomFactory = new locomative_railway_factory();
        railway_factory myBuildFactory  = new train_railway_factory();

        railway myHotelRoomBooking = myHotelRoomFactory.createCar();
        railway myBuildBooking = myBuildFactory.createCar();

        System.out.println(myHotelRoomBooking);
        System.out.println(myBuildBooking);
        
    }
}
