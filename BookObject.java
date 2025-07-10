class Author{
    String name;
    String email;
    char gender;
    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    void display(){
        System.out.println(name);
        System.out.println(email);
        System.out.println(gender);
    }
}
class Book{
    String name;
    Author author;
    double price;
    int qtyInStock;
    Book(String name,Author author,double price,int qtyInStock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    void display(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(qtyInStock);
        author.display();
    }

}
public class BookObject {
    public static void main(String[] args) {
        Author a=new Author("deva","sri34@gmail.com",'F');
        Book b=new Book("sri",a,1000,32);
        b.display();
    }
}
