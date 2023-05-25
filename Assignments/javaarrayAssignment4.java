import java.util.Arrays;
import java.util.Scanner;

public class javaarrayAssignment4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Array Element");  
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int count=1;
           for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count ++;
            }
           } 
           i=count+i-1;
           System.out.println("Frequency of"+arr[i]+"is"+count);
        }
    }
}
