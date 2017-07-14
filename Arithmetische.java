package operatoren;

public class Arithmetische {

	public static void main(String[] args) {

		/*
		 *			+ - * / % 
		 */


		int x = 2 + 2 * 2;
		System.out.println( "x = " + x );
		
		int x2 = x % 3;
		System.out.println("x2 = " + x2); 		// 0
		
		System.out.println("3 % 5 = " + 3 % 5);   // 3
		System.out.println("3 % 5 = " + (3 % 5)); // 3
		
		/*
		 *  Regel 2
		 *  
		 *  Das Ergebnis einer arithmetischen Operation
		 *  ist MINDESTENS vom Typ int
		 *   
		 */
		
		byte b1 = 3; //implizites Casting
		
		byte b2 = 1;
		byte b3 = 2;
		
		//byte b4 = b2 + b3;	// byte <= int 		Compilerfheler!
		byte b4 = (byte) (b2 + b3); 

		long var1 = 2;
		int var2 = 3;
		
		//int var3 = var1 + var2;		int <= long

		float f1 = 4;
		
		f1 =  var2 * f1 - var1;
		//var1 =  var2 * f1 - var1;		long <= float
		
		
		/*
		 * Nicht in der Prüfung: 
		 */
		System.out.println(0.1 + 0.1 + 0.1); // 0.30000000000000004
		
		double d = 0.1 + 0.1 + 0.1;
		System.out.println( d == 0.3 ); // false
		
		
		int erg = 1 + Integer.MAX_VALUE;
		System.out.println(erg);			// -2147483648
		
		
		/*
		 * In der Prüfung (s. das Thema 'Exceptions')
		 */
		
		System.out.println( 5. / 0 );  // Ausgabe: Infinity
		System.out.println( 5 / 0 );   // Laufzeitfehler
		
	}
}
