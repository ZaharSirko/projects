package __k2.__sem2.arh._lab5;

public class _context {
  Strategy strategy;
 public  _context(Strategy strategy){
    this.strategy = strategy;
  }
      public void name(String name){
        this.strategy.name(name);
      }
      public void type(String type){
         this.strategy.type(type);
      }
}
