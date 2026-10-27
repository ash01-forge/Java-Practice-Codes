package Array;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Adeeb");
        names.add("Ishmum");
        names.add("Tajri");
        names.add("Shamim");
        names.add("Nafisa");
        for(String name:names) System.out.println(name);
    }
}
