package Lotto;

public class main {

	static final int ANZAHL_KUGELN = 7;
	static final int ANZAHL_KUGELN_GESAMT = 49;
	static final int ANZAHL_SPIELE = 100000;

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		LottoSpiel mSpiel = new LottoSpiel(ANZAHL_KUGELN, ANZAHL_KUGELN_GESAMT);
		int mGesamtGewinn = 0;
		for (int i = 0; i < ANZAHL_SPIELE; i++) {
			mSpiel.ziehen();
			LottoTipp mTipp = new LottoTipp(ANZAHL_KUGELN, ANZAHL_KUGELN_GESAMT);
			mTipp.abgeben();
			int mGewinnPerTipp = mSpiel.vergleichen(mTipp);
			mGesamtGewinn += mGewinnPerTipp; 
			sb.append(i+1);
			sb.append(". ");
			sb.append(mSpiel);
			sb.append(" --- ");
			sb.append(mTipp);
			sb.append(" --- Gewinn: ");
			sb.append(mGewinnPerTipp);
			System.out.println(sb.toString());
			sb.delete(0, sb.length());
		}
		sb.delete(0, sb.length());
		sb.append("Gesamtgewinn: ");
		sb.append(mGesamtGewinn);
		System.out.println(sb.toString());
	}

}
