class Authors{
    String name;
    String email;
    char gender;
    Authors(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    void displayinfo(){
        System.out.println(name);
        System.out.println(email);
        System.out.println(gender);
    }
}
public class AuthorInformation {
    public static void main(String[] args) {
        Authors a=new Authors("sri","sri87@gmail.com",'F');
        a.displayinfo();
    }
}
