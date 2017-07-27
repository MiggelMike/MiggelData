package taschenrechner;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc;
		String s = "";
		double a = 0;
		double b = 0;
		char Operator = 0;
		double erg = 0; 
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				s += args[i] + " ";
			}			
			s = s.trim();
			sc = new Scanner(s);
		} else {
			System.out.print("Eingabe: ");
			sc = new Scanner(System.in);
		}

		try {
			for (int i = 0; i < 3; i++) {
				switch (i) {
				case 0:
					a = sc.nextInt();
					break;
				case 1:
					Operator = sc.next().charAt(0);
					if (!((Operator == '+') || (Operator == '-') || (Operator == '*') || (Operator == '/')))
						throw new InputMismatchException(Operator + " ist kein gültiger Operator!");
					break;
				case 2:
					b = sc.nextInt();
					break;
				}
			}

			switch (Operator) {
			case '+':
				erg = a + b;
				break;
			case '-':
				erg = a - b;
				break;
			case '/':
				if(b == 0)
					throw new InputMismatchException("Division durch 0 ist ungültig!");
				erg = a / b;
				break;
			case '*':
				erg = a * b;
				break;
			}
			System.out.println(a  + " " + Operator +  " " + b + " = " +  erg);
		} catch (InputMismatchException e) {
			String mErrMsg = e.getMessage();
			if (mErrMsg != null) {
				System.out.println(e.getMessage());
			} else if (s != "") {
				System.out.println("\"" + s + "\" nicht ausgewertet werden!");
			} else {
				System.out.println("Kann nicht ausgewertet werden!");
			}
		}
	}// main
}
