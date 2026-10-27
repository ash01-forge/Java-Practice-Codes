package Pack3;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = false;
    }

    String checkAvailability() {
        if (isAvailable) {
            return "In Stock";

        } else
            return "Out of Stock";

    }

    void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    double applyDiscount(double discountPercentage) {
        price -= price * (discountPercentage / 100.0);
        return price;
    }

    double applyDiscount(double flatAmount, boolean isFlat) {
        if (isFlat) {
            price -= flatAmount;
        }
        return price;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book title:");
        String title = sc.nextLine();
        System.out.println("Enter the book author:");
        String author = sc.nextLine();
        System.out.println("Enter the book price:");
        double price = sc.nextDouble();
        System.out.println("Is the book available?:");
        boolean isAvailable = sc.nextBoolean();
        Book b1 = new Book(title, author, price, isAvailable);
        System.out.println("Availability: " + b1.checkAvailability());
        System.out.println("After  applying 10% Discount Updated Price: " + b1.applyDiscount(10));
        System.out.println("Applying a flat discount of 50 the updated Price: " + b1.applyDiscount(50, true));
        b1.setIsAvailable(true);
        System.out.println("Availability Status: " + b1.checkAvailability());

    }

}

