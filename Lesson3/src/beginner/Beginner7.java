package beginner;

import java.util.Scanner;

public class Beginner7 {

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
	       int b=0;
	       int k=0;
	       for(int i = 0; i < arraySize; i++)
	        {
	    	   if (a[i]>b) 
	    	   { b=a[i];
	    	     k=i;}
	    		        }
	       System.out.print("max element a["+(k+1)+"]= " + b);  
	        }

	}


