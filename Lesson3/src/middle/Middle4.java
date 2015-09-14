package middle;
import java.util.Scanner;
public class Middle4 {

	public static void main(String[] args) {
		   System.out.print("Input string: ");
	       Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();
    	   char[] chArray = str.toCharArray();
    	   int[] a; 
	       a = new int[chArray.length];
	       int sum =0;    
	       boolean bl;
	       for (int i = 0; i<chArray.length; i++){
	    	     if (Character.getNumericValue(chArray[i])<=9){
	    	    	 if (Character.getNumericValue(chArray[i])>=1){
	    	    //	 System.out.println(chArray[i]);
   		       	 sum=sum+Character.getNumericValue(chArray[i]); }
   		             }
	       }
	       System.out.println();
	       System.out.print("sum of the numbers appearing in the string = "+sum);
	}
}
