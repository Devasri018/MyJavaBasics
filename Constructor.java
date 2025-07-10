class Student1{
    String name;
    String regno;
    String DOB;
    Student1(String name, String regno, String DOB, String college,String dept) {
        System.out.println(name);
        System.out.println(regno);
        System.out.println(DOB);
        System.out.println(college);
        System.out.println(dept);
    }
}


public class Constructor {
    static  String dept="CSE";
    static String college="KNCET";
    public static void main(String[] args) {
        Student1 s1=new Student1( "deva","18","09.07.2005",college,dept);
        Student1 s2=new Student1( "ram","19","09.08.2005",college,dept);
        Student1 s3=new Student1( "sri","20","09.09.2005",college,dept);
        System.out.println("Student Details");

    }
}

