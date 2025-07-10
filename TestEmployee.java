class CalledPerson {
    String name;
    CalledPerson(String name){
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }}
class CalledEmployee extends CalledPerson {
    double annualsalary;
    int year;
    String nationalInsuranceNumber;
    CalledEmployee(String name,double annualsalary,int year,String nationalInsuranceNumber){
        super(name);
        this.annualsalary=annualsalary;
        this.year=year;
        this.nationalInsuranceNumber=nationalInsuranceNumber;
    }
    void display(){
        super.display();
        System.out.println(annualsalary);
        System.out.println(year);
        System.out.println(nationalInsuranceNumber);
    }}
 public class TestEmployee{
    public static void main(String[] args) {
        CalledEmployee d = new CalledEmployee( "Deva",60000.0, 2018, "AB123456Z");
        d.display();
    }
}
