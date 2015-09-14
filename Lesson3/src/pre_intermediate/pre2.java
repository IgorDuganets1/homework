package pre_intermediate;

import java.util.Scanner;

public class pre2 {

	public static void main(String[] args) {
		System.out.print("Input string: ");		
		Scanner sc = new Scanner(System.in);
        String st;
        st = sc.nextLine();
        int l=st.length();
        int start = 1;
        int end = l-1;
        char buf[] = new char[end - start];
        st.getChars(start, end, buf, 0);
        System.out.println(buf);
	}

}
