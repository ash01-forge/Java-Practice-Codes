package Array;

import java.util.ArrayList;

public class Arr4 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            n.add(i);
        }
        if (n.contains(3)) {
            System.out.println("Found 3");
        }
        else System.out.println("Not Found!!");
        for (Integer num:n) System.out.println(num);
    }
}
