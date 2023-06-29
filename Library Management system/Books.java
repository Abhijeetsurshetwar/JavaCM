import java.util.Scanner;

public class Books {
    
    Book[] theBooks=new Book[50];
    public static int count;

    Scanner sc=new Scanner(System.in);

    public int compareBookobj(Book b1,Book b2){
        if(b1.bookName.equalsIgnoreCase(b2.bookName)){
            System.out.println("Book name already exist");
            return 0;
        }
        if(b1.sNo == b2.sNo){
            System.out.println("Book of this Sno already Exist");

            return 0;
        }
        return 1;
    }
    public void addBook(Book b)
    {
 
        for (int i = 0; i < count; i++) {
 
            if (this.compareBookobj(b, this.theBooks[i])
                == 0)
                return;
        }
 
        if (count < 50) {
 
            theBooks[count] = b;
            count++;
        }
        else {
 
            System.out.println(
                "No Space to Add More Books.");
        }
    }   
    public void searchBySno(){
        System.out.println("Search Book");
        
        int sNo;
        System.out.println("Enter Serial NUmber of Book");
        sNo=sc.nextInt();    
        
        int flag=0;
        System.out.println("S.no\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        
        for(int i=0;i<count;i++){
            if(sNo == theBooks[i].sNo){
                System.out.println( theBooks[i].sNo + "\t\t"
                + theBooks[i].bookName + "\t\t"
                + theBooks[i].authorName + "\t\t");
                flag ++;
                return ;
            }
        }
        if(flag == 0)
                System.out.println("No Book for Serial No"+sNo+"Found");
                
    }
    public void showAllBooks()
    {
 
        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println(
            "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
 
        for (int i = 0; i < count; i++) {
 
            System.out.println(
                theBooks[i].sNo + "\t\t"
                + theBooks[i].bookName + "\t\t"
                + theBooks[i].authorName + "\t\t");
        }
    }
    public void dispMenu()
    {
        System.out.println(
            "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
            "Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println(
            "Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Book. ");
        System.out.println("Press 8 to Check In Book");
        System.out.println(
            "-------------------------------------------------------------------------------------------------------");
    }
}
