package __k2.__sem2.arh._lab1;

public class _build_booking_factory extends _bookingFactory {
    public booking createCar(){
        return new _build_booking();
    }
}
