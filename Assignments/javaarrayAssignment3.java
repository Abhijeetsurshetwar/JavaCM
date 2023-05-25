

public class javaarrayAssignment3 {
    public static void main(String[] args) {
        C11emp c[]=new C11emp[4];
        C11emp c1=new C11emp();
        C11emp c2=new C11emp();
        c1.Eid=10;
        c1.Ename="Abhijeet";
        c1.Eno=124567889;

        c2.Eid=69;
        c2.Ename="Amrut";
        c2.Eno=124567889;
    
        c[0]=c1;
        c[1]=c2;

        for(int i=0;i<c.length;i++){
            C11emp a=c[i];
            if(a!=null){
                System.out.println(a.Eid);
                System.out.println(a.Ename);
                System.out.println(a.Eno);
            }
            System.out.println("Element no:"+i);
        }
    }
}
