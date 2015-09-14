package pre_intermediate;
import java.util.Scanner;
public class Pre9 {

	public static void main(String[] args) {
		System.out.print("Input number: ");
	       Scanner scn = new Scanner(System.in);
	       int num = scn.nextInt(); 
	       System.out.println();
	       System.out.println("multiplication table for the number " + num +" :");   
	       System.out.println();
	       for (int i = 1; i < 11; i++)
	       {
	    	   System.out.println(num + " x "+ i + " = " + num*i);
	    	  
	       }
	}

}
