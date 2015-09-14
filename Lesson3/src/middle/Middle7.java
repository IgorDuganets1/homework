package middle;

import java.util.Scanner;

public class Middle7 {

	public static void main(String[] args) {
		System.out.print("Input m strings of matrix A: ");
	       Scanner scn = new Scanner(System.in);
	       int m1 = scn.nextInt();
	    System.out.print("Input n columns of matrix A: ");
	       int n1 = scn.nextInt();  
	    
	    System.out.println("Input elements of matrix A: ");
	       int[][] matrixA = new int[m1][n1];
	       	      
	       for (int i = 0; i<m1; i++){
	    	   for (int j = 0; j<n1; j++){
	    		   System.out.print("a["+i+","+j+"]= ");
	    		   matrixA[i][j] = scn.nextInt();
	    	       	    	   }
	    	   	       }
	       System.out.println();
	       System.out.println("matrix A: ");
	       
	       for (int i = 0; i<m1; i++){
	    	   for (int j = 0; j<n1; j++){
	    		   System.out.print(matrixA[i][j]+ "\t");
	    		       	       	    	   }
	    	   System.out.println();
	    	   	       }
	       System.out.println();
	       System.out.println("Input elements of matrix A: ");
	       int[][] matrixB = new int[m1][n1];
	       	      
	       for (int i = 0; i<m1; i++){
	    	   for (int j = 0; j<n1; j++){
	    		   System.out.print("b["+i+","+j+"]= ");
	    		   matrixB[i][j] = scn.nextInt();
	    	       	    	   }
	    	   	       }
	       System.out.println();
	       System.out.println("matrix B: ");
	       
	       for (int i = 0; i<m1; i++){
	    	   for (int j = 0; j<n1; j++){
	    		   System.out.print(matrixB[i][j]+ "\t");
	    		       	       	    	   }
	    	   System.out.println();
	    	   	       }
	       System.out.println();
	       System.out.println("A + B =");
	       for (int i = 0; i<m1; i++){
	    	   for (int j = 0; j<n1; j++){
	    		   System.out.print((matrixA[i][j]+matrixB[i][j])+ "\t");
	    		       	       	    	   }
	    	   System.out.println();
	    	   	       }
	}

}
