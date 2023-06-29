import java.util.Scanner;

public class Book {
    public int sNo;
    public String bookName;
    public String authorName;


    Scanner Sc=new Scanner(System.in);

    public Book(){

        System.out.println("Enter The serial Number of book");
        this.sNo=Sc.nextInt();
        Sc.nextLine();

        System.out.println("Enter The Name of book");
        this.bookName=Sc.nextLine();
        

        System.out.println("Enter The Author name  of book");
        this.authorName=Sc.nextLine();
    }
}
