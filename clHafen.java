package pkgArrays;

public class clHafen {
	clSchiff[] Schiffe = new clSchiff[100];
	public void Ankern(int aAnzSchiffe) {
		for (int i = 0; i < aAnzSchiffe; i++) {
			if(Schiffe[i] == null) {
				Schiffe[i] = new clSchiff();
			}
		}
	}
	
	public String toString() {
		int mVorAnker = 0;
		for (int i = 0; i < Schiffe.length; i++) {
			if(Schiffe[i] != null)
				mVorAnker++; 
		}
		return "Hafen (Schiffe: " + mVorAnker + " - Freie Plätze: "+ (Schiffe.length - mVorAnker) +" )";
	}
}
