package beginner;
import java.util.Scanner;
public class Beginner9 {

	public static void main(String[] args) {
		System.out.print("Input a= ");
	       Scanner scna = new Scanner(System.in);
	       int a = scna.nextInt();
	    System.out.print("Input b= ");
	       Scanner scnb = new Scanner(System.in);
	       int b = scnb.nextInt();
	    int c=a%b;
	    
	    if (c>0)  
	    {
	    	float af,bf;
		    af=a;
		    bf=b;
		    System.out.print(" a / b  = " + af/bf);
	    }
	    else {
	    	System.out.print(" a / b  = " + a/b);	
	    }
	    
	}

}
