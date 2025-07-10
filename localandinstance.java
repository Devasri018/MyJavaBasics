class Student {
    String name;
    String regno;
   String DOB;
    Student(String name, String regno, String DOB, String college,String dept) {
        this.name = name;
        this.regno = regno;
        this.DOB = DOB;
    }
    void displayStudentData() {
        System.out.println("Name: " + name);
        System.out.println("regno: " + regno);
        System.out.println("DOB: " + DOB);
    }
}

public class localandinstance {
    static  String dept="CSE";
    static String college="KNCET";
    public static void main(String[] args) {

        Student[] students = {
                new Student("deva","18","09.07.2005",college,dept),
        new Student("sri","19","08.09.2005",college,dept),
        new Student("ram","20","07.05.2005",college,dept)};
        System.out.println("College: " + college);
        System.out.println("Dept: " +dept);
        System.out.println("Student Details");
        for (Student s : students) {


            s.displayStudentData();
        }
    }
}

