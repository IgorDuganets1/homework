package advanced;

public class Adv1 {

	public static void main(String[] args) {
		
		
		int length = 8 + (int)(Math.random() * ((15 - 8) + 1));
		// System.out.println("length = " + length);
				
		String word="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
				
		char[] a;
	    a = new char[length];
	    
	    for (int i = 0; i<length; i++){
			int index=(int)(Math.random() * (word.length()));
	    	a[i]=word.charAt(index);
			}
	    
	    System.out.print("password: ");
		for (int i = 0; i < length; i++){
			System.out.print(a[i]);
										}
	}

}
