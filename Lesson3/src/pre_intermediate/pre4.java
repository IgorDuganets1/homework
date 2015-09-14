package pre_intermediate;
import java.util.Scanner;
public class pre4 {

	public static void main(String[] args) {
		System.out.print("Input size of array: ");
	       Scanner scn = new Scanner(System.in);
	       int arraySize = scn.nextInt();
	      
	       System.out.println("Input array of "+ arraySize + " elements");
	       int[] a,b;
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
	       
	       System.out.println("second half of the array is :");
	       
	       int arraySize2=arraySize/2 + arraySize%2;
	       b = new int[arraySize2];
	       
	       for(int i = 0; i < arraySize2; i++)
	        {
	    	   b[i] = a[arraySize-arraySize2 + i];
	    	   System.out.print( " " + b[i] + " ");
	    	  
	        }
	       
	       
	       
	}

}
