package pre_intermediate;
import java.util.Scanner;
public class pre5 {

	public static void main(String[] args) {
		boolean bl;
		System.out.print("Input size of array: ");
	       Scanner scn = new Scanner(System.in);
	       int arraySize = scn.nextInt();
	      
	       System.out.println("Input array of "+ arraySize + " elements");
	       int[] a,b;
	       a = new int[arraySize];
	       b = new int[arraySize];
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
	       { if ( a[i]==7|a[i]==9) {
	    	         b[i]=1;
	    	         sum=sum+b[i];
	       							}
	       else if ( a[i]!=(7|9))
	       			{
	    	   b[i]=0;
	    	   sum=sum+b[i];
	       			}
	       }
	     if (bl=sum==0)  
	     { System.out.print("the array doesn't contain number 7 and number 9 :" + bl); }
	    
	        }     
	}

