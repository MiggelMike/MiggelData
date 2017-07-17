
public class UseEclipse {

	public static void main(String[] args) {
		int x1 = 0x012;
		int x2 = 0x12;
		System.out.println(x1);
		System.out.println(x2);
		System.out.println('\u1126');
		double d1 = 0.;
		double d2 = 2e3;	
		byte b1 = (byte)128;
		System.out.println(b1);
		int x5 = 23;
		byte b4 = (byte)x5;
		System.out.println("X = " + 3 / 3 % 5);
		int erg =  Integer.MAX_VALUE;
		System.out.println("X = " + Integer.MAX_VALUE);
		System.out.println("X = " + (Integer.MAX_VALUE + 1));
		System.out.println("X = " + 0x80000000);
		System.out.println("X = " + 0xffffffe0);
		short s = 1 + (byte)1234567890123L;
		System.out.println("X = " + s);
		// https://bitbucket.org/ccjavad/jse_137638.git 
	}
}
