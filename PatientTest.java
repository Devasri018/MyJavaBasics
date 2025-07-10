class Patient{
    String PatientName;
    double height;
    double weight;
    Patient(String PatientName,double height,double weight){
        this.PatientName=PatientName;
        this.height=height;
        this.weight=weight;
    }
    double computeBMI(){
        return weight/(height*height);
    }
}
public class PatientTest {
    public static void main(String[] args) {
        Patient p=new Patient("deva",0.10,1.15);
        System.out.println( p.PatientName);
        System.out.println(p.computeBMI());
    }
}
