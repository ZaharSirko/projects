package __k2.__sem2.arh._lab1;

public class _lab1 {
    public static void main(String[] args) {
        _bookingFactory myHotelRoomFactory = new _build_booking_factory();
        _bookingFactory myBuildFactory  = new _hotel_room_booking_factory();

        booking myHotelRoomBooking = myHotelRoomFactory.createCar();
        booking myBuildBooking = myBuildFactory.createCar();

        System.out.println(myHotelRoomBooking);
        System.out.println(myBuildBooking);
        
    }
}
