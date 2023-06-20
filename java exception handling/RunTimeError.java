
public class RunTimeError {
	
	void m1() {
		System.out.println("Inside m1");
		m2();
	}  
	
	void m2() {
		System.out.println("Inside m2");
		//m1();
	}

	public static void main(String[] args) {
		
		RunTimeError obj = new RunTimeError();
		obj.m1();
		
	}
}
