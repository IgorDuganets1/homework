package pre_intermediate;
import java.util.Scanner;
public class Pre12 {

	public static void main(String[] args) {
		System.out.print("Input integer number: ");
	       Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();
	       
	       char[] chArray = str.toCharArray();
	       int[] a;
	       a = new int[chArray.length];
	       int sum=0;
	     for (int i = 0; i<chArray.length; i++){
	    //	 System.out.println(chArray[i]);
	    	 a[i] = Character.getNumericValue(chArray[i]);
	    	 sum=sum+a[i];
	             }	
	     System.out.println("amount of digits in integer number =" + sum);
	}

}
