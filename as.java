public class as {
    int f;
    int n;
    int bus;
    as( int f,int n){
        this.f = f;
        this.n = n;

    }
    as(int f,int n,int bus){
        this.f = f;
        this.n = n;
        this.bus = bus;
    }
    int sum_v(){
      return f*n;
    }
    int sum_vbus(){
        return f*n*bus;
      }
}
