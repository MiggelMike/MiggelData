package pkgArrays;

public class clCompare {
	static public final int NUMBER_OF_TESTS = 90_000_000;
	private String CompareTyp;
	public long ZeitSpanne;
//	Definieren Sie eine statische Methode 'boolean equalsMitWhile(int[], int[]),
//	die die Inhalte zwei int-Arrays gleicher Länge vergleicht und dabei mit der while-Schleife durch die Arrays läuft.
	static boolean equalsMitWhile(int[] a, int[] b) {
		int i = 0;
		while(i < a.length) {
			if(a[i] != b[i])
				return false;
			i++;
		}
		return true;
	}
//	Definieren Sie eine statische Methode 'boolean equalsMitFor(int[], int[]),
//	die die Inhalte zwei int-Arrays gleicher Länge vergleicht und dabei mit der for-Schleife durch die Arrays läuft.
	static boolean equalsMitFor(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] != b[i])
				return false;
		}
		return true;
	}
	
//	Rufen Sie für zwei int-Arrays die Methode 'equalsMitWhile' mehrmals auf.
//	Die Anzahl der Aufrufe ist mit NUMBER_OF_TESTS definiert. Messen Sie die Gesamtzeit aller Aufrufe.
//	Am Ende berechnen Sie den Mittelwert (Durchschnitt) der Zeit eines einzelnen Aufrufes.
	//System.currentTimeMillis()
	public void CalcEqualsWhile(int[] a, int[] b ) {
		CompareTyp = "CalcEqualsWhile";
		long mStartZeit = System.currentTimeMillis();
		for (int i = 0; i < clCompare.NUMBER_OF_TESTS-1 ; i++) {
			clCompare.equalsMitWhile(a, b);
		}
		long mEndZeit = System.currentTimeMillis();
		ZeitSpanne = mEndZeit - mStartZeit;
	}

//	Rufen Sie für zwei int-Arrays die Methode 'equalsMitFor' mehrmals auf.
//	Die Anzahl der Aufrufe ist mit NUMBER_OF_TESTS definiert. Messen Sie die Gesamtzeit aller Aufrufe.
//	Am Ende berechnen Sie den Mittelwert (Durchschnitt) der Zeit eines einzelnen Aufrufes.
	//System.currentTimeMillis()
	public void CalcEqualsFor(int[] a, int[] b ) {
		CompareTyp = "CalcEqualsFor";
		long mStartZeit = System.currentTimeMillis();
		for (int i = 0; i < clCompare.NUMBER_OF_TESTS-1 ; i++) {
			clCompare.equalsMitFor(a, b);
		}
		long mEndZeit = System.currentTimeMillis();
		ZeitSpanne = mEndZeit - mStartZeit;
	}
	
	public String toString() {
		double mAvgZeitSpanne = ZeitSpanne / clCompare.NUMBER_OF_TESTS;
		return CompareTyp +  " --- Wdh: " + clCompare.NUMBER_OF_TESTS + " --- Milli-Sek: " + ZeitSpanne + " --- AVG-Milli-Sek: " + mAvgZeitSpanne; 
	}
}
