package pre_intermediate;

import java.util.Scanner;

public class Pre13 {

	public static void main(String[] args) {
		System.out.print("Input a = ");
	       Scanner sc=new Scanner(System.in);
	       double a=sc.nextDouble(); 
	       
	    System.out.print("Input b = ");
	       Scanner sc2=new Scanner(System.in);
	       double b=sc2.nextDouble(); 
	       
	    System.out.print("Input c = ");
	       Scanner sc3=new Scanner(System.in);
	       double c=sc3.nextDouble(); 
	       
	       double x1=0,x2=0;
	       x1=(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
	       x2=(-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
	       
	     System.out.println("the solution of quadratic equation :");    
	     System.out.println("x1 = " + x1);  
	     System.out.println("x2 = " + x2); 
	}

}
