package beginner;

public class Beginner6 {

	public static void main(String[] args) {
		System.out.println ("method where each element is divided by 2");
		 for(int i = 1; i <= 50; i++)
	        {
	    	 int y=i%2;
	    	 if (y==0){
			 System.out.print(" "+ i + " ");
	    	 }
	        }
		 System.out.println ();
		 System.out.println ("method where each element has been added  to previous by 2");
		 int k=2;
		 while (k<=50)
			 	{ System.out.print(" "+ k + " "); 
		 		  k+=2;  }
	}

}
