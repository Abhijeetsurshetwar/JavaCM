package inheritance;

public class tester extends developer {
     private float Shiftallowance;


    public float getTextSalary(){
        return getSalary()+getShiftallowance();
    } 


    
    public float getShiftallowance() {
        return Shiftallowance;
    }

    public void setShiftallowance(float shiftallowance) {
        Shiftallowance = shiftallowance;
    }
      
}
