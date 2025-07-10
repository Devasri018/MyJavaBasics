class Box{
    double width;
    double height;
    double depth;
    Box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    double getVolume(){
        return width * height * depth;
    }
}
public class Boxtest {
    public static void main(String[] args) {
        Box b=new Box(12.4,13.5,25.4);
        double volume=b.getVolume();
        System.out.println(volume);

    }
}
