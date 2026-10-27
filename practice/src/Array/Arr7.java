package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class Arr7 {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Mary");
        namesList.add("John");
        namesList.add("Alice");
        namesList.add("Mary");
        namesList.add("Bob");

        System.out.println("Original list: " + namesList);

        // Remove duplicates
        removeDuplicates(namesList);

        // Print the unique list
        System.out.println("List after removing duplicates: " + namesList);
    }

    private static void removeDuplicates(ArrayList<String> namesList) {
        HashSet<String> names= new HashSet<>(namesList);
        namesList.clear();
        namesList.addAll(names);

    }
}
