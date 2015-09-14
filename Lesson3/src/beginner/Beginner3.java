package beginner;

public class Beginner3 {

	public static void main(String[] args) {
		boolean bl1,bl2;
		int x = 30;
		int y1,y2 ;
		int z1 =3; 
		y1 = x%z1;
		bl1=(y1==0)&&(x>0);
		System.out.println (x + "/" + z1 +":" + bl1);
		int z2 =5;
		y2 = x%z2;
		bl2=(y2==0)&&(x>0);
		System.out.println (x + "/" + z2 +":" + bl2);
	}

}
