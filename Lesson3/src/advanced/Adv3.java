package advanced;

import java.util.Scanner;

public class Adv3 {

	public static void main(String[] args) {
		
		int i=0;
		
		Metricks ourmetricks= new Metricks();
		
		System.out.println("Happy Test Manager"); 
		System.out.println();
		System.out.print("Input number of failed test cases (TC): ");
	       Scanner scn = new Scanner(System.in);
	       int failed = scn.nextInt();
	       
	    System.out.print("Input number of passed test cases (TC): ");
	       Scanner scn1 = new Scanner(System.in);
	       int passed = scn1.nextInt();
	     
	     System.out.println();
	     System.out.print("Input complete number of unresolved issues: ");
	       Scanner scn2 = new Scanner(System.in);
	       int complete = scn2.nextInt();
	       
	     System.out.print("Input number of unresolved issues (bugs) with HIGH priority : ");
			       Scanner scn3 = new Scanner(System.in);
			       int high = scn3.nextInt();
			       
		   System.out.print("Input number of unresolved issues (bugs) with Blocker and Critical severity : ");
					Scanner scn4 = new Scanner(System.in);
					int blocker = scn4.nextInt();
		  
		System.out.println();
	       if (ourmetricks.k1(failed, passed)<ourmetricks.failedPassed()){
	    	   	   i++;}
	       else System.out.println("- release has " + ourmetricks.k1(failed, passed) + "% failed TC - UNSUCCESSFUL");
	  
	       if (high<ourmetricks.highPriorityBugs()){
		    		i++;}
		     else System.out.println("- release has " + high + " of unresolved issues (bugs) with HIGH priority - UNSUCCESSFUL");
		       
		 
		    if (blocker <ourmetricks.blockerPriorityBugs()){
		   	       i++;}
		    else System.out.println("- release has " + blocker + " of unresolved issues (bugs) with Blocker and Critical severity - UNSUCCESSFUL");   
		       
		       
	       if (ourmetricks.k2(blocker, complete)<ourmetricks.blockerComplete()) {
		           i++; }
		       else System.out.println("- release has " + ourmetricks.k2(blocker, complete) + "% ratio Blocker Bugs/Complete number of  issues - UNSUCCESSFUL");
		       
		System.out.println(); 
	    if (i==4) {  
	    	System.out.println("!!!  build is STABLE   !!!");}
	    else  System.out.println("!!!     build is NOT STABLE    !!!"); 
	}
}
