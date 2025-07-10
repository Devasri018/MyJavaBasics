class fruit{
    String name;
    String taste;
    String size;
    fruit(String name,String taste,String size){
        this.name=name;
        this.taste=taste;
        this.size=size;
    }
    void eat(){
        System.out.println(name);
        System.out.println(taste);
    }
}
class Apple extends fruit{
    Apple(){
        super("Apple","sweat","medium");
    }
    void eat(){
        System.out.println(taste);
    }
}
class orange extends fruit{
    orange(){
        super("orange","citrus","small");
    }
    void eat(){
        System.out.println(taste);
    }
}
public class Testfruit {
    public static void main(String[] args) {
        fruit f=new fruit("generic fruit","varied","varies");
        f.eat();
        Apple a =new Apple();
        a.eat();
        orange o=new orange();
        o.eat();
    }
}
