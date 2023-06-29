interface STATUS{
    public static final String newstatus = "NEW";

    public static final String inprogress = "IN-PROGRESS";

    public static final String resolved = "Resolved";

}

//To exchange all We use enum  the above |
enum STATUSE{NEW,IN_PROGRESS,resolved}

public  class EnumExample {
    public static void main(String[] args) {
        //track the status

        STATUSE s1 = STATUSE.NEW;
        System.out.println(s1);
        Displaystatus(STATUSE.IN_PROGRESS);


    }
    private static void Displaystatus(STATUSE inProgress){
        switch(STATUSE){
            case NEW:
            System.out.println("Your ticket is registered !!");
            break;
            case IN_PROGRESS:
            System.out.println("Your ticket is registered !!");
            break;
            case RESOLVED:
            System.out.println("Your ticket is registered !!");
            break;
            default:
            System.out.println("it is default");


        }
    }
    public static void Displaystatus(String status){
        if(status.equalsIgnoreCase("new")){
            System.out.println("Your ticket registered and ready to procces !!");
        }else if(status.equalsIgnoreCase("IN-PROGRESS")){
            System.out.println("your ticket resolved by our team");
        }
        else if(status.equalsIgnoreCase("Resolved")){
            System.out.println("your ticket Booked by our team");
        }
    }
}

interface Status{
    public static String newstatus = "New";
    public static String Inprogress = "IN-PROGRESS";
    public static String Resolve = "RESOLVE";
}