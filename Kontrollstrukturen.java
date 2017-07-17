
public class Kontrollstrukturen {

	public static void main(String[] args) {
		// - 1. Berechnen Sie die Summe aller folgenden Werte: 1, 2, 3 ... 10. Geben Sie die Summe aus.
		System.out.println("// - 1. Berechnen Sie die Summe aller folgenden Werte: 1, 2, 3 ... 10. Geben Sie die Summe aus.");
		int erg = 0; 
		for (int i = 1; i <= 10; i++) {
			erg += i;
		}
		System.out.println("Ergebnis: " + erg);
		System.out.println();
		System.out.println("- 2. Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y und geben Sie das Ergebnis aus.\r\n" + 
				           "  Benutzen Sie für die Lösung die for-Schleife.");
		int x = 3;
		erg = 1;
		for (int i = 0; i < 4; i++) {
			erg *= x;  
		}
		System.out.println("Ergebnis: " + erg);
		System.out.println();
		
		System.out.println("- 3. Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y und geben Sie das Ergebnis aus.\r\n" +
						   "Benutzen Sie für die Lösung die while-Schleife.");
		x = 3;
		erg = 1;
		int i = 0;
		while (i < 4) {
			erg *= x;
			i++;
		}
		System.out.println("Ergebnis: " + erg);
		System.out.println();
		System.out.println("- 4. Gegeben ist: x = 3, y = 4. Berechnen Sie bitte x hoch y und geben Sie das Ergebnis aus.\r\n" + 
				           "  Benutzen Sie für die Lösung die Methode ``java.lang.Math.pow``");
		erg = (int) java.lang.Math.pow(3,4);
		System.out.println("Ergebnis: " + erg);
		System.out.println();
		
		System.out.println("5. Zeichnen Sie ein gefülltes Rechteck auf der Konsole");
		for (int k = 0; k < 20; k++) {
			System.out.print('*');
			if( (k + 1) % 5 == 0)
				System.out.println();
		}
		System.out.println("6. Zeichnen Sie ein leeres Rechteck auf der Konsole");
		for (int k = 1; k <= 20; k++) {
			if((k < 6)||(k > 15)||(k % 5 == 0)||(k % 5 == 1)) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			if( k % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("8. Programmieren Sie bitte den Körper der Schleife so, dass mit der Schleife folgende Ausgaben erzeugt werden");
		for(int monat = 1; monat<=12; monat++) {
			int tage = 0;
	        switch(monat) {
		        case 1:
		        case 3:
		        case 5:
		        case 7:
		        case 8:
		        case 10:
		        case 12:
		        	tage = 31;
		        	break;
		        case 2:	
		        	tage = 29;
		        	break;
	        	default:
	        		tage = 30;
	        		break;
	        }
	        System.out.print("Monat " + monat + ": ");
	        for (int t = 1; t <= tage; t++) {
	        	if((monat == 2)&&(t == tage)) {
	        		System.out.print("(" + t + ") ");
	        	}else {
	        		System.out.print(t + " ");
	        	}
	        }
	        System.out.println();
	    }		
	}
}
