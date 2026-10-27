package Array;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            num.add(i);
        }
        System.out.println(num.size());
        System.out.println(num.get(2));
    }
}
