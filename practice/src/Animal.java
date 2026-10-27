public class Animal {
    public static void main(String[] args) {
        System.out.println("Before updating the value:");
        Dog d1=new Dog("Labib","Pagla");
        Dog d2=new Dog("Mahim","Neri");
        d1.display();
        d2.display();
        d1.setname("Dogesh Labib");
        d1.setbreed("Kalo breed");
        d2.setname("Dogesh Mahim");
        d2.setbreed("Lengra Dogesh");
        System.out.println("After Updating:");
        d1.display();
        d2.display();
    }
}
class Dog{
    String name;
    String breed;
    Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    String setname(String name){
        this.name=name;
        return name;
    }
    String setbreed(String breed){
        this.breed=breed;
        return breed;
    }
    void display(){
        System.out.println("Name: "+name );
        System.out.println("Breed: "+breed);
        System.out.println("------------------------------------");
    }

}
