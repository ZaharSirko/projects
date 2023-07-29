package __k2.__sem2.arh._lab4;

public class _lab4 {
    public static void main(String[] args) {
    railway train = new train();
    railway locomotive = new locomotive();
    _types type = new _types();

    System.out.println("Locomotives");
    type.add(locomotive);
    type.type("Freight");
    type.name("locomotive 1");
    type.clear();

    System.out.println("trains");
    type.add(train);
    type.type("passenger's");
    type.name("train 1");
    }
}
