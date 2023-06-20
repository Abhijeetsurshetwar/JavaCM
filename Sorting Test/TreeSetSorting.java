import java.util.TreeSet;

public class TreeSetSorting {
    public static void main(String[] args) {
        
        TreeSet<Integer> ts=new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(01);

        for(Integer val:ts){
            System.out.println(val);
        }
        
        TreeSet<Student> sr=new TreeSet<>();

        sr.add(12,"Abhijeet");
        sr.add(13,"AAAAA");
        sr.add(10,"VIshwajeet");

        for(Student val:sr){
            System.out.println(val);
        }
    }
}
