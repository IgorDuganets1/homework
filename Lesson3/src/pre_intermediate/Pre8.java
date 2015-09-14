package pre_intermediate;
import java.util.Scanner;
public class Pre8 {

	public static void main(String[] args) {
		System.out.print("Input size of Fibonacci sequence output (<74): ");
	       Scanner scn = new Scanner(System.in);
	       int arraySize = scn.nextInt(); 
	       
	    System.out.print("Input quantity of elements in string: ");
	       Scanner scn2 = new Scanner(System.in);
	       int line = scn2.nextInt();
	       
	       int fSize=74;
	       long[] f;
	       f = new long[fSize];
	       f[0]=0; 
	       f[1]=1;
	     
	       for(int i = 2; i < fSize; i++)
	        {
	    	  f[i]=f[i-1] + f[i-2];
	        }
	       System.out.println();
	       System.out.println("Fibonacci sequence - first " + arraySize + " elements :");  
	       System.out.println();
	       boolean bl;
	       for (int i = 0; i < arraySize; i++)
	        {
	    	  if (bl=i%line!=0) 
	    		  { System.out.print("  " + f[i] + "  ");}
	    	  else   
	    	  	{ System.out.println("  " + f[i] + "  ");}
	        }
	       System.out.println();
	        	       
	       boolean bl2;
	       int k=2;
	       int oddSize=50;
	       long[] odd;
	       odd = new long[oddSize];
	       odd[0]=0;
	       odd[1]=1;
	             
	       for (int i = 2; i < fSize; i++)
	        {
	    	  if (bl2=f[i]%2>0) 
	    		  { odd[k]=f[i]; 
	    		    k++;
	    		  }
	      if (k>oddSize)
		      {break;} 	
	    	  } 
	       
	       System.out.println();
	       System.out.println("Fibonacci sequence - first " + oddSize + " odd elements :");  
	       System.out.println();
	       boolean bl3;
	       for (int i=0; i < oddSize; i++)
	        {
	    	  if (bl3=i%line!=0) 
	    		  { System.out.print("  " + odd[i] + "  ");}
	    	  else   
	    	  	{ System.out.println("  " + odd[i] + "  ");}
	        }
	       
	       long sum =0;
	       for (int i=0; i < oddSize; i++)
	        {
	    	  sum=sum+odd[i];
	        }
	       
	       System.out.println();
	       System.out.println();
	       System.out.println("Sum of first "+ oddSize +" odd Fibonacci sequence elements = " + sum);  
	      
	}

}
