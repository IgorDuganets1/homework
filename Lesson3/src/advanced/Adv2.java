package advanced;

import java.util.Scanner;
import java.lang.*;

public class Adv2 {

	public static void main(String[] args) {
		System.out.println("Years converter"); 
		System.out.print("Input arabic numeral (0-2015): ");
	       Scanner scn = new Scanner(System.in);
	 
	       if (scn.hasNextInt()) {   
	    	   
	    	   int n = scn.nextInt();    	
	    	   
	    	   if ((-1<n)&(n<2016)){
	    		   StringBuffer a = new StringBuffer("");
	    	       
	    	       int m1=n/1000;
	    	       for (int j=0; j<m1; j++){
	    	    	   a.append("M");}
	    	       int m2=n%1000;
	    	       	       
	    	       int d1=m2/500;
	    	       int d2=m2%500;
	    	       if ((d1==1)&(d2>=400)) a.append("CM");
	    	       else
	    	       for (int j=0; j<d1; j++){
	    	    	   a.append("D");}
	    	      	       
	    	       int c1=d2/100;
	    	       if ((d1==0)&(c1==4)) a.append("CD");
	    	       else if ((d1==1)&(d2>=400)){} 
	    	            else
	    	            	for (int j=0; j<c1; j++){
	    	            		a.append("C");}
	    	       int c2=d2%100;
	    	       	       
	    	       int l1=c2/50;
	    	       int l2=c2%50;
	    	       if ((l1==1)&(l2>=40)) a.append("XC");
	    	       else
	    	       for (int j=0; j<l1; j++){
	    	    	   a.append("L");}
	    	      	       
	    	       int x1=l2/10;
	    	       if ((l1==0)&(x1==4)) a.append("XL");
	    	       else if ((l1==1)&(l2>=40)) {}
	    	       		else
	    	       			for (int j=0; j<x1; j++){
	    	       				a.append("X");}
	    	       int x2=l2%10;
	    	      	       
	    	       int v1=x2/5;
	    	       int v2=x2%5;
	    	       if ((v1==1)&(v2>=4)) a.append("IX");
	    	       else
	    	       for (int j=0; j<v1; j++){
	    	    	   a.append("V");}
	    	       	       
	    	       int i1=v2;
	    	       if ((v1==0)&(i1==4)) a.append("IV");
	    	       else if ((v1==1)&(v2>=4)) {}
	         			else
	         			for (int j=0; j<i1; j++){
	         				a.append("I");}
	    	      
	    	       System.out.println("Romanian numeral : " + a); 
	    	   }
	    	   else System.out.println("Number out range !");}
	    	   else System.out.print("Not arabic numeral entered !");
	  	  
	}

}
