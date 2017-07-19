package Geometrie;

public class Rechteck {
	public int breite, hoehe;
	public String toString() {
		return "Rechteck (" + breite + " X " + hoehe +")";
	}
	
	public void ChangeDim(int aBreite, int aHoehe) {
		breite = aBreite;
		hoehe = aHoehe;
	}
	
	public static void ChangeDim(Rechteck aRechteck,int aBreite, int aHoehe) {
		aRechteck.breite = aBreite;
		aRechteck.hoehe = aHoehe;
	}
}
