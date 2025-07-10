class Animals{
    void eat(){
        System.out.println("animal is eating");
    }
    void sleep(){
        System.out.println("animal is sleeping");
    }
}
class Bird extends Animals{
    void eat(){
        System.out.println("bird is eating");
    }
    void sleep(){
        System.out.println("bird is sleeping");
    }
    void fly(){
        System.out.println("bird is flying");
    }

}
public class AnimalandBird {
    public static void main(String[] args) {
        Animals a=new Animals();
        a.eat();
        a.sleep();
        Bird b=new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
