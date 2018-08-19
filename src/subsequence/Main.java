package subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Subsequence s = new Subsequence();
        boolean b = s.find(Arrays.asList("A", "B", "C", "D"),
                Arrays.asList("BD", "A", "B", "M", "D", "M", "C", "DC", "D"));
        System.out.println(b);
        //Collection x = new ArrayList(Arrays.asList("A", "B", "C", "D"));
       // Collection y = new ArrayList(Arrays.asList("BD", "A", "ABC", "B", "M", "D", "M", "C", "DC", "D"));
       // boolean b = s.find(Arrays.asList(x), Arrays.asList(y));
       // System.out.println(b);
    }
}
