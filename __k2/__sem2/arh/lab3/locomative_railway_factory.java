package __k2.__sem2.arh.lab3;

public class locomative_railway_factory extends railway_factory {
    public railway createCar(){
        return new locomative_railway();
    }
}
