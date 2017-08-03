package ticketAutomat;

import java.text.Format;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eingabe;
		Tarifzone auswahlTarifzone;
		Euro auswahlEuro = Euro.CENT1;
		doStart: do {
			showPreise();
			System.out.format("Wählen Sie die Preisstufe mit der entsprechenden Taste %n");
			AbbruchHinweis();
			eingabe = sc.next();
			switch (eingabe.toUpperCase().charAt(0)) {
			case 'K':
				auswahlTarifzone = Tarifzone.K;
				break;
			case 'A':
				auswahlTarifzone = Tarifzone.A;
				break;
			case 'B':
				auswahlTarifzone = Tarifzone.B;
				break;
			case 'C':
				auswahlTarifzone = Tarifzone.C;
				break;
			case 'D':
				auswahlTarifzone = Tarifzone.D;
				break;
			case 'Q':
				System.out.format("Abbruch durch Anwender! %n");
				continue doStart;
			default:
				UngueltigeEingeHinweis();
				continue doStart;
			}
			showGeld();
			int gesamtGezahlt = 0;
			int zahlBetrag = auswahlTarifzone.getPreis();
			do {
				try {
					System.out.format("Preisstufe %s - Zahlen Sie bitte %s %n", auswahlTarifzone.toString(),
							NumberFormat.getCurrencyInstance().format((double)(zahlBetrag - gesamtGezahlt)/ 100 ));
					AbbruchHinweis();
				    eingabe = sc.next();
				    if(eingabe.toUpperCase().charAt(0) == 'Q' ){
						System.out.format("Abbruch durch Anwender! %n");
						continue doStart;
				    }

					switch (Integer.valueOf(eingabe)) {
					case 1:
						auswahlEuro = Euro.CENT1;
						break;
					case 2:
						auswahlEuro = Euro.CENT2;
						break;
					case 3:
						auswahlEuro = Euro.CENT5;
						break;
					case 4:
						auswahlEuro = Euro.CENT10;
						break;
					case 5:
						auswahlEuro = Euro.CENT20;
						break;
					case 6:
						auswahlEuro = Euro.CENT50;
						break;
					case 7:
						auswahlEuro = Euro.CENT100;
						break;
					case 8:
						auswahlEuro = Euro.CENT200;
						break;
					case 9:
						auswahlEuro = Euro.CENT500;
						break;
					case 10:
						auswahlEuro = Euro.CENT1000;
						break;
					case 11:
						auswahlEuro = Euro.CENT2000;
						break;
					default:
						UngueltigeEingeHinweis();
						continue;
					}
					gesamtGezahlt += auswahlEuro.getCents();

				} catch (InputMismatchException ex) {
					UngueltigeEingeHinweis();
				}  catch(NumberFormatException ex){
					UngueltigeEingeHinweis();
				}
			} while (zahlBetrag - gesamtGezahlt > 0);
			if(zahlBetrag - gesamtGezahlt == 0){
				System.out.format("Bitte entnehmen Sie Ihr Ticket! %n");
			}else{
				System.out.format("Bitte entnehmen Sie Ihr Ticket und Ihr Rückgeld: %s! %n",
						NumberFormat.getCurrencyInstance().format(Math.abs((double)(zahlBetrag - gesamtGezahlt)) / 100 ));
			}

		} while (true);
	}// main

	static void showPreise() {
		System.out.format("---------------------%n");
		System.out.format("%10s %10s %n", "Preisstufe", "Preis");
		System.out.format("---------------------%n");
		for (Tarifzone t : Tarifzone.values()) {
			System.out.format("%10s %10s %n", t, NumberFormat.getCurrencyInstance().format((double)t.getPreis() / 100));
		}
		System.out.format("---------------------%n");
	}

	static void showGeld() {
		System.out.format("Taste %n");
		for (Euro e : Euro.values()) {
			double tmp = (double) e.getCents() / 100;
			System.out.format("%-8d %8s %n", e.ordinal() + 1, NumberFormat.getCurrencyInstance().format(tmp));
		}
		System.out.format("---------------------%n");
	}

	static void AbbruchHinweis() {
		System.out.format("Abbruch mit <q><Q>%n");
	}

	static void UngueltigeEingeHinweis() {
		System.out.format("Ungültige Eingabe! %n");
	}


}

enum Tarifzone {
	K(140), A(230), B(470), C(960), D(1140);

	private int preis;

	Tarifzone(int preis) {
		this.preis = preis;
	}

	public int getPreis() {
		return preis;
	}

}

enum Euro {
	CENT1(1), CENT2(2), CENT5(5), CENT10(10), CENT20(20), CENT50(50), CENT100(100), CENT200(200), CENT500(
			500), CENT1000(1000), CENT2000(2000);

	private int cents;

	private Euro(int cents) {
		this.cents = cents;
	}

	public int getCents() {
		return cents;
	}

}
