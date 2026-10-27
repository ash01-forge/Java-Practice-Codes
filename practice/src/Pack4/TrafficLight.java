package Pack4;

public  class TrafficLight {
    private String colour;
    public double   duration;
    double time;

    public TrafficLight(String colour, double duration) {
        this.colour = colour;
        this.duration = duration;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
     void checkColour(){
        if (colour=="red")
            System.out.println("Colour: Red");
        else
            System.out.println("Colour: Green");

    }
    void display(){
        System.out.println("Colour: "+colour);
        System.out.println("Duration: "+duration);
    }
}
class Main{
    public static void main(String[] args) {
        TrafficLight t1=new TrafficLight("red",45);
        t1.setColour("green");
        t1.checkColour();
        t1.display();
    }
}