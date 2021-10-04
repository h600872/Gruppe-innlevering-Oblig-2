package no.hvl.dat100;

public class O1B {

	public static void skrivUtv1(int[][] matrise) {
		
		for (int i[]: matrise) {
			for (int j: i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	
	public static String toString(int[][] matrise) {
		
		String text = "";
		
		for (int i[]: matrise) {
			for (int j: i) {
				text += j  + ", ";
			}
			text += "/n";
			
		}
		return text;
	}
	
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] matrise1 = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matrise1[i][j] = matrise[i][j] * tall; 
			}
		}
		return matrise1;

	}
	
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		if (!(mat1.length == mat2.length)) {
			return false;
		}
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
//	public static int[][] speile(int [][] matrise) {
//		
//		int[][] speilMat = new int[matrise.length][matrise[0].length];
//		int counter1 = -1;
//		int counter2 = 0;
//		
//		for (int i = matrise.length - 1; i >= 0; i--) {
//			counter1++;
//			for (int j = matrise[i].length - 1; j >= 0; j--) {
//				speilMat[counter1][counter2] = matrise[i][j];
//				counter2++;
//			}
//		}
//		return speilMat;
//	}
	
	public static void main(String[] args) {
		int[][] tabell = {{2, 4, 6}, {6, 4, 8}};
		int[][] tabell2 = {{2, 4, 6}, {6, 5, 8}};
//		skrivUtv1(tabell);
//		System.out.println(tilStreng(tabell));
//		System.out.println(toString(skaler(2, tabell)));
//		System.out.println(erLik(tabell, tabell2));
//		System.out.println(toString(speile(tabell)));
	}
}
