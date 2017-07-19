package Geometrie;

public class Kreis{
	int radius;
	void zeichne(){
		for (int i = 0; i < radius; i++) {
			for (int j = 0; j < i; j++) {
				System.out.println('*');	
			}
		}
		System.out.println(' ');
	}
}

