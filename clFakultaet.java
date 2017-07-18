
public class clFakultaet {
	
	static long Fakultaet(int aLimit) {
		long erg = 1;
		if(aLimit > 1) {
			erg *= aLimit * Fakultaet(--aLimit);
		}
		return erg;
	}

	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			long erg = Fakultaet(i);
			System.out.println("Fakultät von " + i + ": "+ erg); 
		}
	}

}
