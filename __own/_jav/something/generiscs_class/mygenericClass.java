package __own._jav.something.generiscs_class;

public class mygenericClass <Thing, V> {
    Thing x;
    V y;
    mygenericClass(Thing x, V y){
        this.x = x;
        this.y = y;
    }

    public Thing getValueX(){
        return x ;
    }

    public V getValueY(){
        return y ;
    }
}
