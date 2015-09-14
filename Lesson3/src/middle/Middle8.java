package middle;

import java.util.Scanner;
import java.lang.Character;
public class Middle8 {

	public static void main(String[] args) {
		System.out.println("Input string : " );
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.println("Output string : ");
        System.out.print(Character.toUpperCase(s.charAt(0)));
	      
	       for (int i = 1; i<s.length(); i++){
	    	   if(s.charAt(i) == Character.toLowerCase(s.charAt(i))) 
	    	   {
	    		   System.out.print(s.charAt(i));   
	    	   }
	    	   else System.out.print(" " + Character.toLowerCase(s.charAt(i))); 
		       }
     
    }

}

