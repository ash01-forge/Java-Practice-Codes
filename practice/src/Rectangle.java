
class Rectangle1{
int length;
int breadth;
int area(){
    return length*breadth;
}
int perimeter(){
    return 2*(length+breadth);
}
Rectangle1(int length,int breadth){
    this.length=length;
    this.breadth=breadth;

}
void display(){
    System.out.println("Area: "+area());
    System.out.println("Perimeter: "+perimeter());
}


}
public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 r1=new Rectangle1(10,15);
        r1.area();
        r1.perimeter();
        r1.display();
    }
}
