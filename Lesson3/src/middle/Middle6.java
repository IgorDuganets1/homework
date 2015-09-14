package middle;

import java.util.Scanner;

public class Middle6 {

	public static void main(String[] args) {
		System.out.println("Input string : " );
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int wordLength=0,maxWordLength=0,i2=0;
     
        for(int i=0; i < s.length(); i++) {
        	 
        	 maxWordLength=i-i2;
        	
           if(s.charAt(i) == ' ') {
              i2=i+1;
              if (maxWordLength>wordLength){ 
            	  wordLength=maxWordLength; }
           							}
           if (s.charAt(i) != ' ') {
        	 maxWordLength++; 
             	 }
        									}
       if (maxWordLength<wordLength){ 
         	  maxWordLength=wordLength; }
        System.out.println("Max word length = " + maxWordLength);
        
    }

}
