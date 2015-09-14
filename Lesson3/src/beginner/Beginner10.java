package beginner;
import java.util.Scanner;
public class Beginner10 {

	public static void main(String[] args) {
		
		System.out.print("Input n = ");
	       Scanner scna = new Scanner(System.in);
	       int n = scna.nextInt();
	       
	       for(int k = 0; k < n; k++)
	       {
	       for(int i = 0; i < k+1; i++)
	        {
	        	System.out.print(" * ");
	        }  
	       System.out.println(); }
	       
	       for(int k = n-1; k >0; k--)
	       {
	       for(int i = 0; i<k; i++)
	        {
	        	System.out.print(" * ");
	        }  
	       System.out.println(); }
	       
	}

}
