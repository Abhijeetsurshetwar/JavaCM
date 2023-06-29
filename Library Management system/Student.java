import java.util.Scanner;

public class Student {
    String studentName;
    String regNum;

    Book borrowedBook []= new Book [3];
    public int booksCount = 0;

    Scanner sc = new Scanner(System.in);

    public Student(){
        System.out.println("Enter Student name : ");

        this.studentName=sc.nextLine();

        System.out.println("Enter register Number : ");
        this.regNum=sc.nextLine();
    }
}
