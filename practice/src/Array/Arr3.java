package Array;

import java.util.ArrayList;

public class Arr3 {
    public static void main(String[] args) {
        ArrayList<String>n=new ArrayList<>();
        n.add("Dhaka");
        n.add("Tangail");
        n.add("Barisal");
        n.add("Khulna");
        n.add("Chattogram");
        n.remove(2);
        for (String name:n) System.out.println(name);
    }
}
