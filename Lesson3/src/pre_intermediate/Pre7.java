package pre_intermediate;
import java.util.Scanner;
public class Pre7 {

	public static void main(String[] args) {
		System.out.print("Input size of array: ");
	       Scanner scn = new Scanner(System.in);
	       int arraySize = scn.nextInt();
	      
	       System.out.println("Input array of "+ arraySize + " integer elements");
	       int[] a;
	       a = new int[arraySize];
	       Scanner input = new Scanner(System.in);
	       
	       for(int i = 0; i < arraySize; i++)
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
	       
	       int k=0,l=0,max=0,min;
	       
	 	       for(int i = 0; i < arraySize; i++)
	        {
	    	   if (a[i]>max) 
	    	   { max=a[i];
	    	     k=i;}
	    	//   else
	    	  // { min=a[i];
	    	//   l=i;
	    	   }
	       min=max;
	       for(int i = 0; i < arraySize; i++)
	        {
	    	   if (a[i]<min) 
	    	   { min=a[i];
	    	     l=i;}
	    		        }
	       System.out.println("max element a["+(k+1)+"] multiplyed by 2 = " + max*2);  
	       System.out.println("min element a["+(l+1)+"] multiplyed by 2 = " + min*2);  
	        }

	}


