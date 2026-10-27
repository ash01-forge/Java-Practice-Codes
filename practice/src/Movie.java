import java.util.Scanner;

public class Movie {
    String title;
    String genre;
    double ticketPrice;

    public Movie(String title, String genre, double ticketPrice) {
        this.title = title;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }
    double applyDiscount(double percentage){
        ticketPrice-=ticketPrice*(percentage/100.0);
        return ticketPrice;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Genre: "+genre);
        System.out.println("Ticket Price: "+ticketPrice);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the movie title:");
        String title=sc.nextLine();
        System.out.println("Enter the movie genre:");
        String genre=sc.nextLine();
        System.out.println("Enter the Ticket Price:");
        double ticketPrice=sc.nextDouble();
        System.out.println("Before discount:");
        Movie m1=new Movie(title,genre,ticketPrice);
        m1.display();
        m1.applyDiscount(15);
        System.out.println("---------------------------------");
        System.out.println("After Discount:");
        m1.display();
    }
}
