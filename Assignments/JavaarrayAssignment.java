
public class JavaarrayAssignment {
    public static void main(String[] args) {
      int a[]={10,20,30,40};
      int min=a[0];
      int max=a[0];
      for (int i=0;i<a.length;i++){
        System.out.println(a[i]);
        if(a[i]<min){
            min=a[i];
        }
      } 
      for (int j=0;j<a.length;j++){
        if(a[j]<max){
            max=a[j];
        }
      }  
      System.out.println("Smallest Element is "+min);
      System.out.println("Gratest Element is "+max);
    }
}
