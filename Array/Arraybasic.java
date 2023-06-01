
public class Arraybasic {
    public static void main(String[] args) {
        System.out.println("ABhijee");
        
        int rnol = 1;
        int rno2 = 2;
        int rno3 = 3;

        int[] sRno=new int[5];
        sRno[0]= 1;
        sRno[1]= 2;
        sRno[2]= 3;
        sRno[3]= 4;
        sRno[4]= 5;


        for(int i=0;i< sRno.length;i++){
            System.out.println("sRno Value :- "+sRno[i]);
        }


        student[] sArray =new student[5];

        student sObj= new student();
        sObj.setRno(1);
        sObj.setName("Avishkar");

        student sObj1=new student();
        sObj.setRno(2);
        sObj.setName("Shitosh");

        sArray[0] = sObj;
        sArray[1] = sObj1;

        for(int i=0;i<sArray.length;i++){
            student sVal=sArray[i];

            if(sVal != null){
                System.out.println(sVal.getRno());
                System.out.println(sVal.getName());
            }
        }

    }
}
