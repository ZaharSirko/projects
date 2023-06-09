package __k2.__sem2.diskr.lab6;
import java.util.ArrayList;
import java.util.List;

public class _lab6 {
    public static void main(String[] args) {

        // boolean[] x = {false, false, false, false, true, true, true, true};
        // boolean[] y = {false, false, true, true, false, false, true, true};
        // boolean[] z = {false, true, true, true, true, true, false, false};

        boolean[] x = {false, false, false, true, false, true, true, false};
        boolean[] y = {false, false, true, false,  true, false, false, false};
        boolean[] z = {true, true, false, false, false, false, false, true};

        boolean[] f = {false, true, true, true, true, true, false, false};

        String functionType = getFunctionType(f);
        System.out.println("Type of boolean function: " + functionType);
         
        System.out.println ("is linier: " + isLinier(x, y, z));
         System.out.println("saveZero:  " +saveZero(f));
         System.out.println("saveOne:   "  + saveOne(f));
        

        String ddnf = getDDNF(x, y, z, f);
        System.out.println("DDNF: " + ddnf);

        String dknf = getDKNF(x, y, z, f);
        System.out.println("DKNF: " + dknf);
    }

 private static boolean isLinier(boolean[] x,boolean[]y,boolean[]z){
   for (int i = 0; i < z.length; i++) {
    if(((x[i]&&y[i]==true)||((x[i]&&z[i])==true))){
        return false;
    }
   }
    return true;
 }
 private static boolean saveZero(boolean[] f){
    if(f[0]==true){
        return false;
    }
     return true;
  }
  private static boolean saveOne(boolean[] f){
    if(f[f.length-1]==false){
        return false;
    }
     return true;
  }


    private static String getFunctionType(boolean[] f) {
        boolean hasTrue = false;
        boolean hasFalse = false;

        for (boolean value : f) {
            if (value) {
                hasTrue = true;
            } else {
                hasFalse = true;
            }
        }

        if (hasTrue && hasFalse) {
            return "General boolean function";
        } else if (hasTrue) {
            return "Identity";
        } else {
            return "Zero";
        }
    }

    private static String getDDNF(boolean[] x, boolean[] y, boolean[] z, boolean[] f) {
        List<String> terms = new ArrayList<>();

        for (int i = 0; i < f.length; i++) {
            if (f[i]) {
                String term = getTerm(x[i], y[i], z[i]);
                terms.add(term);
            }
        }

        return String.join(" + ", terms);
    }

    private static String getDKNF(boolean[] x, boolean[] y, boolean[] z, boolean[] f) {
        List<String> terms = new ArrayList<>();

        for (int i = 0; i < f.length; i++) {
            if (!f[i]) {
                String term = getTerm(!x[i], !y[i], !z[i]);
                terms.add(term);
            }
        }

        return String.join(" * ", terms);
    }

    private static String getTerm(boolean x, boolean y, boolean z) {
        StringBuilder term = new StringBuilder();

        if (x) {
            term.append("x");
        } else {
            term.append("!x");
        }

        if (y) {
            term.append("y");
        } else {
            term.append("!y");
        }

        if (z) {
            term.append("z");
        } else {
            term.append("!z");
        }

        return term.toString();
    }
}
