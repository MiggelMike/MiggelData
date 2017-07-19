package Geometrie;

public class Rechteck {
	int breite, hoehe;
	void zeichne(){
		for (int i = 0; i < hoehe; i++) {
			for (int j = 0; j < breite; j++) {
				System.out.print('*');
			}
			System.out.println(' ');
		}
	}
}



