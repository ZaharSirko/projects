package __k2.__sem2.diskr.lab6;
import java.util.ArrayList;
import java.util.List;

public class _lab6 {
    public static void main(String[] args) {

        boolean[] x = {false, false, false, false, true, true, true, true};
        boolean[] y = {false, false, true, true, false, false, true, true};
        boolean[] z = {false, true, false, true, false, true, false, true};
        boolean[] f = {false, false, false, false, false, false, false, false};

        String functionType = getFunctionType(f);
        System.out.println("Тип булевої функції: " + functionType);


        String ddnf = getDDNF(x, y, z, f);
        System.out.println("ДДНФ: " + ddnf);

        String dknf = getDKNF(x, y, z, f);
        System.out.println("ДКНФ: " + dknf);
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
            return "Загальна булева функція";
        } else if (hasTrue) {
            return "Тотожність";
        } else {
            return "Нуль";
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
