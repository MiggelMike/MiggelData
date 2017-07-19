package Aufgaben;

import java.util.Random;

import Geometrie.Kreis;
import Geometrie.Rechteck;

public class clBasis {

	public static void main(String[] args) {
		ZeichneRechtecke(100, 1, 20);
		Kreis k = new Kreis();
		k.radius = 5;
		System.out.println(k.toString());
	}
	
	static int RandomRange(int aMinDim, int aMaxDim) {
		return (new Random().nextInt( aMaxDim - aMinDim + 1) + aMinDim); 
	}
	
	static void ZeichneRechtecke(int aAnz, int aMinDim, int aMaxDim) {
		for (int i = 0; i < aAnz; i++) {
			Rechteck re = new Rechteck();
//			Rechteck.ChangeDim(re, RandomRange(aMinDim, aMaxDim), RandomRange(aMinDim, aMaxDim));
			re.ChangeDim(RandomRange(aMinDim, aMaxDim), RandomRange(aMinDim, aMaxDim));
			System.out.println((i+1) +": "+ re.toString());
		}
	}

}
