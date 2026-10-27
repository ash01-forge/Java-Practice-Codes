package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Arr5 implements Comparable<Arr5>{
String name;

    public Arr5(String name) {
        this.name = name;
    }
    public int compareTo(Arr5 name){
      return this.name.compareTo(name.toString());
    }

    public static void main(String[] args) {
        ArrayList<String> n=new ArrayList<>();
        n.add("Dhaka");
        n.add("Tangail");
        n.add("Barisal");
        n.add("Khulna");
        n.add("Chattogram");
        Collections.sort(n);
        for (String name:n) System.out.println(name);
    }
}
