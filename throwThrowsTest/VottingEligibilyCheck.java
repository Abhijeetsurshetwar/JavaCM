package throwThrowsTest;

public class VottingEligibilyCheck {
	
	void checkVottingEligibility(int age) throws NotEligibleForVotting {
		
		
		if(age < 18) {
			
			System.out.println("You are not Eligible for Votting");
			
			//int c = 10/0;
			
			throw new NotEligibleForVotting("Not Eligible for Votting");
			
		} else {
			
			System.out.println("You are eligible for Votting");
		}
		
	}


}
