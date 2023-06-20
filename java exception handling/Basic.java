
public class Basic {
	
	public static void main(String[] args) {
		
		try {
			
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[3]);
		 
		 System.out.println("Inside main method");
		 
	  }catch (NullPointerException e) {
		  
		  try{
			  
		  }catch(Exception e1) {
			  
		  }
		System.out.println(e);
	} catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println(ae);
	}
		catch(Exception e) {
		System.out.println(e);
	} 
		finally {
		System.out.println("Inside Finally block");
	}
		
		
		Basic b = new Basic();
		b.m1();
		b.m2();
		
	}
	
	void m1() {
		System.out.println("Inside m1 method");
		
			try {
				Class.forName("Test");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	
	void m2() {
		System.out.println("Inside m2 method");
	}

}
