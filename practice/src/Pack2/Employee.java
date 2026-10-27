package Pack2;

import java.util.Scanner;

public class Employee {
    String name;
    int id;
    boolean isPresent;

    public Employee(String name, int id, boolean isPresent) {
        this.name = name;
        this.id = id;
        this.isPresent = isPresent;
    }

    void markPresent() {
        isPresent = true;
    }

    void displayStatus() {
        if (isPresent) {
            System.out.print("Name: " + name);
            System.out.println("(Pesent)");
        } else {
            System.out.print("Name: " + name);
            System.out.println("(Absent)");

        }
    }


}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] E = new Employee[5];
        for (int i = 0; i < E.length; i++) {
            System.out.println("Enter the info for Employee: " + (i + 1));
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Pesent?(True/False): ");
            boolean isPresent = sc.nextBoolean();
            sc.nextLine();
            E[i] = new Employee(name, id, isPresent);
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the Employee (1-5) you want to mark present: ");
            int num = sc.nextInt();
            E[num - 1].markPresent();
        }
        for (int i = 0; i < E.length; i++) {
            E[i].displayStatus();
        }
    }
}
