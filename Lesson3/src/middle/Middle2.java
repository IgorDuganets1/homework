package middle;

public class Middle2 {

	public static void main(String[] args) {
		
	    boolean bl;
	    int l=0;
		for (int i=0 ; i<999; i++) {
		
			int sum1=i/100 + i/10%10 + i%10;
			for (int k=0 ; k<999; k++){	
			    int sum2=k/100 + k/10%10 + k%10;
			    if (bl=sum1==sum2) {
			    l++;
			 // System.out.println(i + " " + k);
			    }
			} 
		} 
		System.out.println("quantity of lucky tickets in the roll" + l);
	}

}
