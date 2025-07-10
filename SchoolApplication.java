class Person{
    String name;
    String dateOfbirth;
    Person(String name,String dateOfbirth){
        this.name=name;
        this.dateOfbirth=dateOfbirth;
    }
    void displayPerson(){
        System.out.println(name);
        System.out.println(dateOfbirth);
    }
}
class Teacher extends Person{
    double salary;
    String subject;
    Teacher(String name,String dateOfbirth,double salary,String subject){
        super(name,dateOfbirth);
        this.salary=salary;
        this.subject=subject;
    }
    void displayTeacher(){
        displayPerson();
        System.out.println(salary);
        System.out.println(subject);
    }
}
class student extends Person{
    int studentId;
    student(String name,String dateOfbirth,int studentId){
        super(name,dateOfbirth);
        this.studentId=studentId;
    }
    void displaystudent(){
        displayPerson();
        System.out.println(studentId);
    }
}
class collegestudent extends student{
    String collegename;
    int year;
    collegestudent(String name,String dateOfbirth,int studentId,String collegename,int year){
        super(name,dateOfbirth,studentId);
        this.collegename=collegename;
        this.year=year;
    }
    void displaycollegename(){
        displaystudent();
        System.out.println(collegename);
        System.out.println(year);
    }
}
public class SchoolApplication {
    public static void main(String[] args) {
        Person p = new Person("deva","09-07-2005");
        System.out.println("Person");
        p.displayPerson();
        System.out.println("Teacher");
        Teacher t=new Teacher("sri","09-07-2005",50000,"English");
        t.displayTeacher();
        System.out.println("student");
        student s=new student("ram","09-07-2005",123);
        s.displaystudent();
        System.out.println("collegestudent");
        collegestudent cs=new collegestudent("ajay","09-07-2005",123,"KNCET",2026);
        cs.displaycollegename();
    }
}
