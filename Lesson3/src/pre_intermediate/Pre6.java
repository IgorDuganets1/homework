package pre_intermediate;
import java.util.Scanner;
public class Pre6 {

	public static void main(String[] args) {
		
		System.out.print("Input size of array: ");
	       Scanner scn = new Scanner(System.in);
	       int arraySize = scn.nextInt();
	      
	       System.out.println("Input array of "+ arraySize + " elements :");
	       int[] a;
	       a = new int[arraySize];
	   
	       Scanner input = new Scanner(System.in);
	       
	       for (int i = 0; i < arraySize; i++)
	        {
	    	   System.out.print("a ["+ i + "] = ");
	    	   a[i] = input.nextInt();
	        }
	 
	       System.out.println("array elements :");  
	       for (int i = 0; i < arraySize; i++)
	        {
	    	   System.out.print("  " + a [i] + "  ");
	        }
	       System.out.println();
	       
	       int sum = 0;       
	       for (int i = 0; i < arraySize; i++)
	       { 
	    	   sum=sum+a[i];
	    	}
	       System.out.println("sum of all elements = " + sum); 
	       float average,sumbl,arraySizebl;
	       sumbl=sum;
	       arraySizebl=arraySize;
	       average=sumbl/arraySizebl;
	       System.out.println("arithmetic average of all elements = " + average ); 
	    
	        }     	
}