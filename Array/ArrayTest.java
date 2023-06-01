import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        int a=10;

        int arr[]=new int[10];
        arr[0]=10;
        arr[1]=30;

        System.out.println("first Element is "+arr[0]);
        System.out.println("Second Element is "+arr[1]);

        ArrayList <Integer> As = new ArrayList<>(255);
           As.add(250); 
           As.add(50); 
           As.add(20); 
           As.add(25);
           
           for(int i=0 ; i<As.size();i++){
            System.out.println("ArrayList "+" "+ As.get(i));
           }
    }
}
