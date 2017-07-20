package pkgArrays;

import java.util.Random;

public class Array {

	static final int ARRAY_SIZE = 100_000;

	public static void main(String[] args) {
		int[][] arr = createArray(4, 5);
		arr[1][1] = 5;
		printArray(arr);
		setArrayVal(arr, 2);
		printArray(arr);
		clHafen Hafen = new clHafen();
		Hafen.Ankern(12);
		System.out.println(Hafen);

		int[] arr1 = new int[ARRAY_SIZE];
		FillArrayRandom(arr1);
		int[] arr2 = new int[ARRAY_SIZE];
		FillArrayRandom(arr2);
		clCompare cmp = new clCompare();
		for (int i = 0; i < 10; i++) {
			cmp.CalcEqualsWhile(arr1, arr2);
			System.out.println(cmp.toString());
			cmp.CalcEqualsFor(arr1, arr2);
			System.out.println(cmp.toString());
		}
	}

	static int[][] createArray(int aDim1, int aDim2) {
		int[][] mResult = new int[aDim1][aDim2];
		return mResult;
	}

	static void setArrayVal(int[][] aArr, int aVal) {
		for (int[] mSubArr : aArr) {
			for (int i = 0; i < mSubArr.length; i++) {
				mSubArr[i] = aVal;
			}
		}
	}

	static void FillArrayRandom(int[] aArr) {
		Random r = new Random();
		for (int i = 0; i < aArr.length; i++) {
			aArr[i] = r.nextInt(100);
		}
	}

	static void printArray(int[][] aArr) {
		for (int i = 0; i < aArr.length; i++) {
			for (int j = 0; j < aArr[i].length; j++) {
				System.out.print(aArr[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
