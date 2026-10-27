package pack9;
//
//class Point2D
//{
//    int x, y;
//    public Point2D(int x, int y){
//        this.x = x;
//        this.y = y;
//        System.out.println("Point2D constructor");
//    }
//    public String Display(){
//        //System.out.println("X="+x+",Y="+y);
//      return "X="+x+",Y="+y;
//    }
//}
//class Point3D extends Point2D {
//    int z;
//
//    public Point3D(int x, int y, int z) {
//        super(x, y);
//        this.z = z;
//        System.out.println("Point3D constructor");
//    }
//
//    //write codes here
//    public String Display() {
//        //super.Display();
//        //System.out.print(",Z=" + z);
//        return super.Display() + ",Z=" + z;
//
//
//    }
//}
//
//public class Test{
//    public static void main(String args[]){
//        Point2D p2D = new Point2D(1, 2);
//        System.out.println(p2D.Display());
//        Point3D p3D = new Point3D(5, 4, 3);
//        System.out.println(p3D.Display());
//    }
//}
// public class Myparent {
//    private int p;
//    public final int myfunction(){
//        return p*p;
//    }
//    public void set_p(int Q){p = Q;}
//    // Write your code here
//
//    public int getP() {
//        return p;
//    }
//
//    public Myparent(int p) {
//        this.p = p;
//    }
//}
//public class Mychild extends Myparent{
//    public Mychild(int K){ super(K); }
//
//    public final int myfunction(){
//        return p*p+1;
//    }
//    // write your code of myroot() that finds the square
//    // root of p in class Myparent
//    // write other necessary codes here
//    double myroot(){
//        return Math.sqrt(getP());
//    }
//}
//public class Mytest {
//    public static void main(String[] args) {
//        Myparent c1, c2;
//        c1 = new Mychild(2);
//        c2 = new Mychild();
//        c2.set_p(2);
//        int x = c2. myfunction ();
//        double y = ((Mychild) c1).myroot(); // find square
//        root of p in class Myparent
// System.out.println("x = " + x + ", y = " + y);
//    }
//}
public class Vehicle {
    void start(){
        System.out.println("Vehicle is starting");
    }
    final void move(){
        System.out.println("Vehicle is moving");
    }
}
class Bus extends Vehicle{
    //void move(){
    // System.out.println("Bus is moving");
    //}
    void needFuel(){
        System.out.println("Bus needs fuel");
    }
    void start(){
        super.start();
        System.out.println("Bus is starting");

    }
}
class Cycle extends Vehicle {
    void pedal(){
        System.out.println("Pedal the cycle");
    }
}
class VehicleTest{
    public static void main(String[] args) {
        Vehicle bus=new Vehicle();
        bus.start();
        //bus.needFuel();
        Vehicle cycle=new Vehicle();
        cycle.move();
        //cycle.pedal();
    }
}
