package Pack8;

public class Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee("Jamal",27,"Dhaka","B+",23323,"Finance",40000);
//        emp.sleep();
//        emp.setName("kamal");
        System.out.println(emp.name);
        emp.work();
    }
}

class Person{
    String name;
    int age;
    String location;
    String blood_group;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Person(){
        System.out.println("In Person Class Constructor");
    }

    public Person(String name, int age, String location, String blood_group) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.blood_group = blood_group;
    }

    public void sleep() {
        System.out.println("Person is sleeping");
    }
    public void eat(){
        System.out.println("Person is eating");
    }
}

class Employee extends Person{
    int emp_id;
    String department;
    double salary;

    public Employee(){
        super();
        System.out.println("In Employee Class Constructor");
    }

    public Employee(String name, int age, String location, String blood_group, int emp_id, String department, double salary) {
        super(name,age,location,blood_group);
        this.emp_id = emp_id;
        this.department = department;
        this.salary = salary;
    }

    public void work(){
        System.out.println(super.age);
        System.out.println("Employee is working");
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}