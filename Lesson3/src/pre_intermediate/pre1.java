package pre_intermediate;

import java.util.Scanner;

public class pre1 {

	public static void main(String[] args) {
		
		 boolean blShe,blHe,they;
		System.out.print("Input SheSmile (1 - smile; 0 - not smile): ");
	       Scanner scna = new Scanner(System.in);
	       int she = scna.nextInt();
	       blShe=(she==1);
	       System.out.println(blShe); 
	     
	    System.out.print("Input HeSmile (1 - smile; 0 - not smile): ");
	       Scanner scnb = new Scanner(System.in);
	       int he = scnb.nextInt();
	       blHe=(he==1);
	       System.out.println(blHe); 
	       
	       String message="they're eventually going to go to the cinema";
	       if (they=she==he) {
	    	   System.out.print(message + " )): " + they);   
	       }
	       else {
	    	   System.out.print(message + " ((: " + they);   
	       }
	    }

}
