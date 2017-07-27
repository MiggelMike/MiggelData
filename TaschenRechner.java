package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

class berechne {

}

public class TaschenRechner {
	static double Erg = 0;
	static double x, y = 0;
	static char Operator = 0;

	public static void main(String[] args) {
		String mMsg = "";
		try {
			if (args.length > 0) {
				for (int i = 0; i < args.length; i++) {
					mMsg += args[i].toString() + " ";
				}

				// Format: 3 + 4 oder 6 / 2 ...
				for (int i = 0; i < args.length; i++) {
					Scanner sc = new Scanner(args[i]);
					if ((i == 0) || (i == 2)) {
						sc.nextInt();
					} else {
						Operator = sc.next().charAt(0);
					}
				}
			} else {
				Scanner sc = new Scanner(System.in);
			}
		} catch (InputMismatchException e) {
			// System.out.println("Das Zeichen \"" + args[i].toString() + "\" in
			// den Argumenten \"" + mMsg + "\" ist falsch!");
		}

	}// main
}
