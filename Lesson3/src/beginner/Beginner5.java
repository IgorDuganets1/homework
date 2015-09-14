package beginner;

import java.util.Scanner;

public class Beginner5 {

	public static void main(String[] args) {
		int n=10; 
		 do {			
		 System.out.print("Input mark in the school: ");
	       Scanner scn = new Scanner(System.in);
	       int mark = scn.nextInt();
	    
		   switch(mark)
		   {
		   case 1:
		   System.out.println ("failed");
		   break;
		   
		   case 2:
		   System.out.println ("bad");
		   break;
		   case 3:
		   System.out.println ("satisfactory");
		   break;
		   case 4:
		   System.out.println ("good");
		   break;
		   case 5:
		   System.out.println ("excellent");
		   break;
		   default:
		   System.out.println ("unknown mark");
		   }
		}
		while (--n > 0);

	}

}
