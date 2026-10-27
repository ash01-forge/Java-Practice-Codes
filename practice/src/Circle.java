public class Circle {
    double radius;
    double changeRadius(double radius){
        this.radius=radius;
        return radius;
    }
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
        return Math.PI*(radius*radius);
    }
    double circumference(){
        return 2*Math.PI*radius;
    }
    void display(){
        System.out.println("Area: "+area());
        System.out.println("Circumference: "+circumference());

    }

    public static void main(String[] args) {
        System.out.println("Before updatig:");
        Circle c1=new Circle(6);
        c1.display();
        System.out.println("-----------------------------");
        System.out.println("After updating:");
        c1.changeRadius(8);
        c1.display();
    }
}
