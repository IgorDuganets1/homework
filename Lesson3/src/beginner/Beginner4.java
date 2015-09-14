package beginner;

import java.util.Scanner;

public class Beginner4 {

	public static void main(String[] args) {
		System.out.print("Input size of array: ");
	       Scanner scn = new Scanner(System.in);
	       int arraySize = scn.nextInt();
	      
	       System.out.println("Input array of "+ arraySize + " elements");
	       int[] a;
	       a = new int[arraySize];
	       Scanner input = new Scanner(System.in);
	       
	       for(int i = 0; i < arraySize; i++)
	        {
	    	   System.out.print("a ["+ i + "] = ");
	    	   a[i] = input.nextInt();
	        }
	 
	       System.out.println("array elements :");  
	       for(int i = 0; i < arraySize; i++)
	        {
	    	   System.out.print("  " + a [i] + "  ");
	        }
	       System.out.println();
	       
	       System.out.print("Input number for search: ");
	       Scanner scn2 = new Scanner(System.in);
	       int number = scn2.nextInt();
	       
	       for(int i = 0; i < arraySize; i++)
	        {
	    	   if (a[i]==number) {
	    		   System.out.println("element ¹" + (i+1) + " = " + number);	
	    	   }
	        }

	}

}
