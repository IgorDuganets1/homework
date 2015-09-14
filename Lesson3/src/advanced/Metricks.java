package advanced;

public class Metricks {
	
	
	
	public double failedPassed () {
		final int FAILED_PASSED=20;
		return FAILED_PASSED;
	}
	
	public double k1 (int f, int p){
		return 100*f/(p+f);
	}
	
	public double blockerComplete(){
		final int BLOCKER_COMPLETE=5;
		return BLOCKER_COMPLETE;
	}
	
	public double k2 (int b, int c){
		return 100*b/c; 
	}
	
	public double highPriorityBugs () {
		final int HIGH_PRIORITY_BUGS=10;
		return HIGH_PRIORITY_BUGS;
	}
	
	public double blockerPriorityBugs () {
		final int BLOCKER_PRIORITY_BUGS=5;
		return BLOCKER_PRIORITY_BUGS;
	}
	
	/*	public boolean verifyK1 (){
	if (k1()<FAILED_PASSED){
		return true;}
	}
	
	int k1,high,blocker;

	public void buildNotStableOutput(int h, int b){
		
	System.out.println("build is NOT STABLE");
	System.out.println("release has " + k1 + "% failed TC - UNSUCCESSFUL");
	System.out.println("release has " + h + "of unresolved issues (bugs) with HIGH priority - UNSUCCESSFUL");
	System.out.println("release has " + b + "of unresolved issues (bugs) with Blocker and Critical severity - UNSUCCESSFUL");
} */

}