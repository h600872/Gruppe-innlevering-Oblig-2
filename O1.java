package no.hvl.dat100;

public class O1 {

	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++)
			System.out.println(tabell[i]);

	}

	public static String tilStreng(int[] tabell) {
		String til = "";
		for (int i = 0; i < tabell.length; i++)
			til += tabell[i] + ","; 
			return "[" + til + "]";
	}

	public static int summer(int[] tabell) {
		
//		 int tall = 0; for (int i = 0; i < tabell.length; i++) { tall += tabell[i]; }
//		 return tall;
//		
//		
//		 int tall = 0; for (int i: tabell) { tall += i; } return tall;

		int i = 0;
		int tall = 0;
		while (i != tabell.length) {
			tall += tabell[i];
			i++;
		}
		return tall;
	}

	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++)
			if (tall == tabell[i])
				return true;

		return false;
	}

	public static int posisjonTall(int[] tabell, int tall) {
		int tall1 = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				tall1 = i;
			}
		}
		return tall1;
	}

	public static int[] reverser(int[] tabell) {
		int[] tabell1 = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			tabell1[i] = tabell[tabell.length - 1 - i];
		}
		return tabell1;
	}

	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1])
				return false;
		}
		return true;
	}

	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] tabellS = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabellS.length; i++)
			if (i < tabell1.length)
				tabellS[i] = tabell1[i];
			else
				tabellS[i] = tabell2[i - tabell1.length];
			return tabellS;
	}

	public static void main(String[] args) {
		int[] tabell1 = { 2, 4, 6, 1 };
		int tall = 1;
//		skrivUt(tabell1);
//		System.out.println(tilStreng(tabell1));
//		System.out.println(summer(tabell1));
//		System.out.println(finnesTall(tabell1, tall));
//		System.out.println(posisjonTall(tabell1, tall));

//		for (int i = 0; i < tabell1.length; i++) {
//			System.out.println(reverser(tabell1)[i]);
//			}
//		System.out.println(erSortert(tabell1));
		System.out.println(tilStreng(settSammen(tabell1, reverser(tabell1))));
	}
}
