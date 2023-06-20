package throwThrowsTest;

public class Test {
	
	
	void m1() throws NotEligibleForVotting {
		
		VottingEligibilyCheck obj = new VottingEligibilyCheck();
		
	  obj.checkVottingEligibility(20);
		
		
	}
	
	public static void main(String[] args)  {
		
		Test obj = new Test();
		
		try {
			obj.m1();
		} catch (NotEligibleForVotting e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
