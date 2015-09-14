package beginner;
import java.util.Scanner;
public class Beginner8 {

	public static void main(String[] args) {
		
		System.out.print("Input string: ");		
		Scanner sc = new Scanner(System.in);
        String st;
        st = sc.nextLine();
       
        System.out.print("Input N char, (less or equal " + st.length() + "): ");
	       Scanner scn = new Scanner(System.in);
	       int n = scn.nextInt();
	       int n1=n;
	      
	       char[] chArray = st.toCharArray();
	       
	       for(int k = n1; k >0; k--)
	        {
	       for(int i = 0; i < n; i++)
	        {
	        	System.out.print(chArray[i]);
	        }  
	       n--;
	        }
	       
	}

}
