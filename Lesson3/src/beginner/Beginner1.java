package beginner;

public class Beginner1 {

	public static void main(String[] args) {
		int [] a = new int [3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		int[]b = new int[3];
		for (int i=0; i<3; i++)
		{
		b[i]=a[i]*3;
		System.out.println(b[i]);
		}
				
	}

}
