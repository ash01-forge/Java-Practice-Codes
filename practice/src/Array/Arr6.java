package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Arr6 {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            n.add(i);
        }
        Collections.sort(n,Collections.reverseOrder());
        for (Integer i:n) System.out.println(i);
    }
}
