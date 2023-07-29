package __k2.__sem2.arh.lab1;

public class Tclass <T extends Comparable<T>>  {
    T x;
    T y;
    T tmp;
    Tclass(){

    }
    Tclass(T x, T y){
        this.x = x; 
        this.y = y; 
        
    }

    public void spawp(T x,T y){        
        this.tmp =  this.x;
        this.x =   this.y;
        this.y=  this.tmp;

    }

    public T getMaxElement() {
        if (x.compareTo(y) >= 0) {
            return x;
        } else {
            return y;
        }
    }
    public T getMinElement() {
        if (x.compareTo(y) <= 0) {
            return x;
        } else {
            return y;
        }
    }
    public T getValueX(){
        return x ;
    }

    public T getValueY(){
        return y ;
    }
    public void setX(T x) {
        this.x = x;
    }
    public void setY(T y) {
        this.y = y;
    }
}