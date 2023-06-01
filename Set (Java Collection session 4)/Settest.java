import java.util.HashSet;
import java.util.Iterator;

public class Settest {
    public static void main(String[] args) {
        HashSet<String> hs =new HashSet<>();
        hs.add("Umessss");
        hs.add("Abhiiiii");
        hs.add("Ashuiiii");
        hs.add("njiiiii");

        Iterator<String> it = hs.iterator();
        System.out.println(it.next());
        
    }   
}

