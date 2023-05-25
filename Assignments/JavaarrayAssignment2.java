import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class JavaarrayAssignment2 {
   public static void printsum(int a[],int n){
        int sum=0;  
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        } 
   }
   public static void evenodd(int[] a,int n){
        int odd=0;
        int even=0;
        for (int i=0;i<n;i++){
            if(a[i]%2==0){
                even=even++;
         }
            else{
                odd=odd++;
            }
        } 
        System.out.println("Even Number in An array are"+even);
        System.out.println("Odd Numbers in An Array are"+odd);
    }
    public static void findduplicate(int [] a,int n){
        System.out.println("Duplicate Elements are");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]+" ");
                }
            }    
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        System.out.println("Elements in array are");
        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
        } 
        printsum(arr, arr.length);
        evenodd(arr, arr.length);
        findduplicate(arr, arr.length);
        }
}

