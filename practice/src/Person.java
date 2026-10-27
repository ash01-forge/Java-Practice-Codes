import org.w3c.dom.ls.LSOutput;

public class Person {
    public static void main(String[] args) {


        Person1 person1 = new Person1("Adeeb", 21);
        Person1 person2 = new Person1("Labib", 22);
        System.out.println(person1.name+" "+person1.age);
        System.out.println(person2.name+" "+ person2.age);

    }
    }
    class Person1{
    String name;
    int age;
    Person1(String n,int a){
        name=n;
        age=a;

    }

    }

