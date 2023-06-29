import java.util.Scanner;

public class Library{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("welcome To library !");
        System.out.println("Select from following option");

        Books ob =new Books();
        Students obstudenets = new Students();

        int choice ;
        int searchChoice;

        do{
            ob.dispMenu();
            choice = sc.nextInt();

            switch (choice){

                case 1:
                    Book b = new Book();
                    ob.addBook(b);
                    break;
                case 2:
                    System.out.println("Press 1 to search by serial number");
                    searchChoice = sc.nextInt();

                    switch(searchChoice){
                        case 1:
                            ob.searchBySno();
                            break;
                        }
                case 3:
                    ob.showAllBooks();
                    break;

                case 4:
                    obstudenets.displayStudents();
                    break;
                
                default:
                        System.out.println("Enter number between 0 to 5");
                        break;

        }
    }
    while(choice != 0);
    }
}