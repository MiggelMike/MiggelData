package variablen;

public class Identifier_Bezeichner {

	public static void main(String[] args) {

		/* Buchstaben */
		int x;
		
		/* Unterstrich */
		int a_b;

		/* Ziffer (nicht vorne) */
		
		//int 12x;		Compilerfehler
		int x12;
		int x1y2;
		
		/* Währungssymbol */
		int $;
		int €;
		
		// Bitte sowas nie machen:
		int _ = 13;
		int _________ = 55;
		int __________ = 22;
		
		System.out.println(_________);
		
	}

}
