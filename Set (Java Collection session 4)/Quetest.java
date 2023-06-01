import java.util.ArrayList;
import java.util.TreeSet;

public class Quetest {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(50);
        al.add(60);
        al.add(30);
        al.add(20);

        TreeSet<Integer> tl= new TreeSet(al);


        for(Integer integer:tl){
                System.out.println(integer);
        }
    }
}
