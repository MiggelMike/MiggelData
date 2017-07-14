package variablen;

public class Literale {

	public static void main(String[] args) {

		/*
		 * int - Literale
		 */

		int x1 = 12;			// dezimal
		int x2 = +12;
		int x3 = -12;
		System.out.println(x3);

		int x4 = 012;			// oktal         1 * 8 hoch 1 + 2 * 8 hoch 0 (Umrechnung nicht in der Prüfung)
		System.out.println(x4);
		
		int x5 = 0xAbCd;		// hexadezimal
		x5 = 0x012ABC;
		x5 = 0xDeadCafe;

		// ab Java 7 (nicht in der Prüfung)
		int x6 = 0b01010101;	// binär
		
		
		/*
		 * long - Literale
		 */
		
		// long var1 = 12345678901; // Compilerfehler: der Wert ist zu groß für int-Literal
		long var1 = 12345678901L;	// Literal: long, dezimal
		long var2 = 12345678901l;	// Literal: long, dezimal
		
		/*
		 * char - Literale
		 */
		char ch1 = 'a';
		//char ch2 = 'bc';	Compilerfehler
		char ch2 = '\uAbCd';	//hexadezimale Unicode-Position
		
		
		/*
		 * boolean: true false
		 */
		
		
		/*
		 * double - Literale 
		 */
		double d1 = 12.3;
		double d2 = +12.3;
		double d3 = -12.3;
		double d4 = -12.;	// -12.0
		double d5 = 0.0;
		double d6 = .0;		// 0.0
		
		double d7 = 2e3;	// 2.0 * 10 hoch 3 = 2000.0
		System.out.println(d7);
		
		double d8 = -3E-2;	// -3.0 * 10 hoch (-2) = -0.03
		System.out.println(d8);
		
		/*
		 * float - Literale
		 */
		// float f1 = 12.1; //Compilerfehler: float <= double 
		
		float f1 = 12.1f;	// float - Literal
		float f2 = 12.1F;	// float - Literal
		
	} // 

}
