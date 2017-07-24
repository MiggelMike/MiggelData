package Lotto;

import java.util.Random;

public class LottoBase {
	protected int anzahlKugel = 7;
	protected int anzahlKugelGesamt = 49;
	protected int[] zahlen = new int[7]; 
	public LottoBase(int anzahlKugel, int anzahlKugelGesamt) {
		this.anzahlKugel = anzahlKugel;
		this.anzahlKugelGesamt = anzahlKugelGesamt;
	}
	
	protected boolean isUnique(int aZahl){
		for(int mZahl : zahlen){
			if(mZahl == aZahl)
				return false;
		}
		return true;
	}
	
	protected void generiereZahlen(){
		Random r = new Random();
		NextNumber:
		for (int i = 0; i < zahlen.length; i++) {
			do{
				int mZahl = r.nextInt(anzahlKugelGesamt) + 1;
				if(isUnique(mZahl)){
					zahlen[i] = mZahl;
					continue NextNumber;
				}
			}while(true);
		}
		java.util.Arrays.sort(zahlen);
	}
	
	@Override
	public String toString() {
		return java.util.Arrays.toString(zahlen);
	}
	
}
