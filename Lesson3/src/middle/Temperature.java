package middle;

import java.util.Scanner;

public class Temperature {
	
	double tc,tk;
	
	public void celsiusToKelvin(){
	tk=0;
	tc=0;
	System.out.print("enter temperature in Celsius: ");
 	   Scanner scn = new Scanner(System.in);
 	   tc = scn.nextDouble();
 	   tk = tc + 273.15;
 	   System.out.print(tc + " Celsius = "+ tk + " Kelvin");
 	}
	
	public void kelvinToCelsius(){
	tk=0;
	tc=0;
		System.out.print("enter temperature in Kelvin: ");
 	   Scanner scn = new Scanner(System.in);
 	   tk = scn.nextDouble();
 	   tc = tk - 273.15;
 	   System.out.print(tk + " Kelvin = "+ tc + " Celsius");
	}
}
