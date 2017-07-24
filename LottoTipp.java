package Lotto;

public class LottoTipp extends LottoBase {

	public LottoTipp(int anzahlKugel, int anzahlKugelGesamt) {
		super(anzahlKugel, anzahlKugelGesamt);
	}
	
	public void abgeben(){
		this.generiereZahlen();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Tipp ");
		sb.append(this.anzahlKugel);
		sb.append(" aus ");
		sb.append(this.anzahlKugelGesamt);
		sb.append(" ");
		sb.append(super.toString());
		return sb.toString();
	}	
}
