package operatoren;

public class Zuweisung_und_Casting {

	public static void main(String[] args) {

		/*
		 * Regel 1.
		 * 
		 * Der Compiler vergleicht die Typen!!!
		 * Der Compiler vergleicht die Typen!!!
		 * Der Compiler vergleicht die Typen!!!
		 */
		
		//float f1 = 12.34;		Compilerfehler: fouble <= double
		//							KEIN implizites Casting bei der Zuweisung double in float
		
		float f1 = (float)12.34;    // Casting

		/*
		 * Ausnahme aus der Regel 1:
		 * 
		 * Nur bei der Zuweisein int-Literalten!!!
		 * Der Wert vom int-Literal (!) wird vom Compiler analysiert. 
		 * 
		 */
		byte b1 = 12;		// implizites Casting zu byte hier
		byte b2 = (byte)12; // explizites Casting
		
		int x = 12;
		//byte b3 = x;		// Compilerfehler! Keine Auswertung von Variablen! 
							// Kein implizites Casting (nur mit Literalen)! 
		
		
	}

}
