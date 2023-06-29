import java.util.Scanner;

public class Students {
    Scanner sc = new Scanner(System.in);
    Student theStudent [] = new Student[50];
    
    public static int count = 0;

    public void addStudent(Student s){
        for(int i = 0;i<count;i++){
            if (s.regNum.equalsIgnoreCase(theStudent[i].regNum)){
                System.out.println("Student Already Exists");
           
                return;
            }
        }
        if(count <= 50){
            theStudent[count] =s;
            count ++;
        }
    }

    public void displayStudents(){
        System.out.println("Student name \t reg Number");
        for(int i = 0;i<count;i++){
            System.out.println(theStudent[i].studentName +
                                    "\t\t"+theStudent[i].regNum);
        }
}
    public int isStudent(){
        System.out.println("Enter Reg Number");

        String regNUm = sc.nextLine();

        for(int i=0;i<count;i++){
            if(theStudent[i].regNum.equalsIgnoreCase(regNUm)){
                return i;
            }
        }
        System.out.println("Student not recognized");
        System.out.println("Get registered");
        
        return -1;

    }    

}