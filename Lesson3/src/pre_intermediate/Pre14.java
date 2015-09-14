package pre_intermediate;
import java.util.Scanner;
public class Pre14 {

	public static void main(String[] args) {
		System.out.print("Input word: ");
	       Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();
	       
	       char[] chArray = str.toCharArray();
	       int[] a;
	       a = new int[chArray.length];
	       
	       for (int i = 0; i<chArray.length; i++){
	    	   for (int k = 0; k<i; k++){
	    		   System.out.print(" "); 
	    	   }
	   	   	 System.out.println(chArray[i]); }

	}

}
