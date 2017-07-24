package Lotto;

public class LottoSpiel extends LottoBase {
	
	final int KOSTEN = 1;

	public LottoSpiel(int anzahlKugel, int anzahlKugelGesamt) {
		super(anzahlKugel, anzahlKugelGesamt);
	}
	
	public void ziehen(){
		this.generiereZahlen();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Spiel ");
		sb.append(this.anzahlKugel);
		sb.append(" aus ");
		sb.append(this.anzahlKugelGesamt);
		sb.append(" ");
		sb.append(super.toString());
		return sb.toString();
	}
	
	public int vergleichen(LottoTipp aTipp){
		int mGewinn = 0;
		for (int i = 0; i < zahlen.length; i++) {
			if(java.util.Arrays.binarySearch(aTipp.zahlen, zahlen[i]) > -1)
				mGewinn++; 
		}
		
		if(mGewinn == 0)
			return -KOSTEN;
		else
			return mGewinn = (int) Math.pow(10, mGewinn) - KOSTEN; 
	}
}
