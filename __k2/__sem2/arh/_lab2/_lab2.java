package __k2.__sem2.arh._lab2;

public class _lab2 {
    public static void main(String[] args) {
    booking build = new _build();

    booking room_hotel = new _hotel_room();

    _types type = new _types();

    System.out.println("Hotels");
    type.add(room_hotel);
    type.type("W1");
    type.name("E1");
    type.clear();

    System.out.println("Builds");
    type.add(build);
    type.type("A1");
    type.name("Q1");
    
    }
}
