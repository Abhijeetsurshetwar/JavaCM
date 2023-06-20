package throwThrowsTest;

public class NotEligibleForVotting extends Exception {

	public NotEligibleForVotting(String msg) {
		super(msg);
	}
}
