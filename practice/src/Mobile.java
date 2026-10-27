import java.util.Scanner;

public class Mobile {
    String brand;
    String model;
    double price;

     Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    Mobile(){
         this.brand="Unknown";
         this.model="Unknown";
         this.price=0.0;
    }
    void displayDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }

}
//class Main{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the brand name:");
//        String brand=sc.nextLine();
//        System.out.println("Enter the model name:");
//        String model=sc.nextLine();
//        System.out.println("Enter the price:");
//        double price=sc.nextDouble();
//
//        Mobile[] m1 = new Mobile[2];
//        m1[0]  = new Mobile(brand,model,price);
//        m1[1]=new Mobile();
//        m1[0].displayDetails();
//        m1[1].displayDetails();
//    }
//}