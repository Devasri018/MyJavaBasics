class rectangle{
    int length;
    int breadth;
    rectangle(){
        System.out.println("default constructor");       //default constructor
        length=10;
        breadth=9;
        System.out.println(length);
        System.out.println(breadth);
    }
    rectangle(int length,int breadth){
        this();                           //used in this.keyword call the default constructor
        length=length;
        breadth=breadth;
        System.out.println("parmeterized constructor");
        System.out.println(length);
        System.out.println(breadth);
    }
    void sample(int length,int breadth){
        System.out.println( length);
        System.out.println(breadth);
    }
}
public class Constructorrectangular {
    public static void main(String[] args) {
        rectangle r1=new rectangle(10,9);
        r1.sample(4,6);

    }
}
