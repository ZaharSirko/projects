package __k2.__sem2.arh._lab3;

import java.util.ArrayList;
import java.util.List;

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
