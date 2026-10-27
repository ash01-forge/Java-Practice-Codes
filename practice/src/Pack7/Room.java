package Pack7;

import java.util.Scanner;

public class Room {
    int roomNumber;
    String type;
    double pricePerNight;
    boolean isBooked;

    public Room(int roomNumber, String type, double pricePerNight, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.isBooked = isBooked;
    }
    void bookRoom(){
        if (isBooked){
            System.out.println("The room is not booked");
        }
            else System.out.println("Already Booked");
    }
    void checkout(){
        isBooked=false;
    }
    void display(){
        System.out.println("Room Number: "+roomNumber);
        System.out.println("Room Type: "+type);
        System.out.println("Room Price Per Night: "+pricePerNight);


    }

}
class Main{
    public static void main(String[] args) {
        Room[] r = new Room[3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<r.length;i++){
            System.out.println("Enter the room number:");
            int roomNumber=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Room Type:");
            String type=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Room Price Per Night:");
            double pricePerNight=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the availability of the room:");
            boolean isBooked=sc.nextBoolean();
            sc.nextLine();
            r[i]=new Room(roomNumber,type,pricePerNight,isBooked);
        }
        r[1].bookRoom();
        r[2].bookRoom();
        r[2].checkout();
        for (int i=0;i<r.length;i++){
            r[i].display();
        }
    }
}
