package inheritance;
public class developer extends Inheritance {
    private float carAllowance;
    public float getSvDeveloperSalary(){
        return getSalary()+getCarAllowance();
    } 

    public float getCarAllowance() {
        return carAllowance;
    }

    public void setCarAllowance(double  d) {
        this.carAllowance = (float) d;
    }

}
