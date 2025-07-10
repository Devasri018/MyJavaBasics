class Animal{
    String color="White";
    Animal(){
        System.out.println("Animal constructor");
    }
    void Sound(){
        System.out.println("Animal main sound");
    }
}
class Dog extends Animal{
    String color="Black";
    Dog(){
        super();
        System.out.println("Dog constructor");
    }
    void printcolor(){
        System.out.println("Dog color:" +color);
        System.out.println("Animal color:"+super.color);
    }
    void Sound(){
        super.Sound();
        System.out.println("Dog barks");
    }
}
public class inheritancedefault {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printcolor();
        d.Sound();
    }
}
