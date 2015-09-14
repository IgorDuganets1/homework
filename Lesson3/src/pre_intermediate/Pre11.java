package pre_intermediate;
import java.util.Scanner;
public class Pre11 {

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
	       
	       boolean bl;
	       int k=0;
	       for (int i = 0; i < arraySize-2; i++)   
	       {
	       if (a[i]==1&a[i+1]==2&a[i+2]==3)
	       { k++;}
	       }
	       if (bl=k>0)
	       {System.out.print(" sequence {1, 2, 3} appears in the array - " + bl);}

	}

}
