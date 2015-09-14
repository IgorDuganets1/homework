package middle;

import java.util.Scanner;

public class Middle1 {

	public static void main(String[] args) {
		System.out.print("Input postive integer number: ");
	       Scanner sc = new Scanner(System.in);
	  
	         if(sc.hasNextInt()) {   	  
	    	   int a = sc.nextInt(); 
	    	   
		      	    	   
	    	   if (a<0){
	    		   System.out.println("Entered integer number is negtive !");
	    		  	    		      	   }
	    	   if (a==0){
	    		   System.out.println("NULL is not integer number !");
	    		      	   }
	    	  
	    	   if (a>0){
	    	   String str = String.valueOf(a);
	    	   char[] chArray = str.toCharArray();
	    	   int[] b; 
		       b = new int[chArray.length];
		       int sum=0;
		       
		       for (int i = 0; i<chArray.length; i++){
	   		       	 b[i] = Character.getNumericValue(chArray[i]);
	   		    	 sum=sum+b[i];
	   		             }
		       System.out.println("Amount of digits in integer number = " + sum); 
	    	   			}
	    	   } 
	       else {
	           System.out.println("It's not integer number !");
	         	}
	        
	}
	

}
