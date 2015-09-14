package middle;

import java.util.Scanner;

public class Middle3 {

	public static void main(String[] args) {
		System.out.print("Input size of array: ");
	       Scanner scn = new Scanner(System.in);
	       int arraySize = scn.nextInt();
	      
	       System.out.println("Input array of "+ arraySize + " integer elements");
	       int[] a;
	       a = new int[arraySize];
	       Scanner input = new Scanner(System.in);
	       
	       for (int i = 0; i < arraySize; i++)
	        {
	    	   System.out.print("a ["+ i + "] = ");
	    	   a[i] = input.nextInt();
	        }
	       System.out.println();
	       System.out.println("array elements :");  
	       for (int i = 0; i < arraySize; i++)
	        {
	    	   System.out.print("  " + a [i] + "  ");
	        }
	       System.out.println();	
	       
	       int[] b;
	       b = new int[arraySize];
	       int k=arraySize-1;
	       	       
	       for (int i = 0; i < arraySize; i++)
	        {
	    	   b[k]=a[i];
	      	   k--;
	    	  }
	       System.out.println();	
	    //   System.out.println();
	       System.out.println("elements of inverted array :");
	       
	       for (int i = 0; i < arraySize; i++)
	        {
	    	   System.out.print("  " + b [i] + "  ");
	        }

	}

}
