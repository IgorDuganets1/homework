package middle;

import java.util.Scanner;

public class Middle5 {

	public static void main(String[] args) {
		
		Temperature ourtemperature = new Temperature();
		
		System.out.println("Temperature Converter  ");
		System.out.println("press '1' for Celsius => Kelvin : ");
		System.out.println("press '2' for Kelvin => Celsius : ");
	       Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();
	      
	       switch (str){
	       case "1":
	    	   ourtemperature.celsiusToKelvin();
	    	   break;
	       case "2":
	    	   ourtemperature.kelvinToCelsius();
	    	   break;
	    	default:
	    		System.out.println("not '1' or '2' entered ");
	       }
	       
	}

}
