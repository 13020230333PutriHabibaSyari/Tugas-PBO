public class Ekspresi1 {
	public static void main(String[] args) {
		int x = 1; int y = 2; float fx; float fy;
	
		System.out.print ("x/y (format integer) = "+ x/y);
		System.out.print ("\nx/y (format float) = "+ x/y);
	
		fx=x;
		fy=y;
		
		System.out.print ("\nfx/fy (format integer) = "+ fx/fy);
		System.out.print ("\nfx/fy (format float) = "+ fx/fy);
		
		System.out.print ("\nfloat(x)/float(y) (format integer) = "+ (float)x/(float)y);
		System.out.print ("\nfloat(x)/float(y) (format float) = "+ (float)x/(float)y);
		
		x = 10; y = 3;
		System.out.print ("\nx/y (format integer) = "+ x/y);
		System.out.print ("\nx/y (format float) = "+ x/y);
	}
}
