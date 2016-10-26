
public class Start {

	public static void main(String[] args) {
		int[][] tab = new int[15][];

		int[] t1 = { 75 };
		int[] t2 = { 95, 64 };
		int[] t3 = { 17, 47, 82 };
		int[] t4 = { 18, 35, 87, 10 };
		int[] t5 = { 20, 4, 82, 47, 65 };
		int[] t6 = { 19, 1, 23, 75, 03, 34 };
		int[] t7 = { 88, 2, 77, 73, 7, 63, 67 };
		int[] t8 = { 99, 65, 04, 28, 6, 16, 70, 92 };
		int[] t9 = { 41, 41, 26, 56, 83, 40, 80, 70, 33 };
		int[] t10 = { 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 };
		int[] t11 = { 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 };
		int[] t12 = { 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 };
		int[] t13 = { 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 };
		int[] t14 = { 63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 };
		int[] t15 = { 4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23 };

		tab[0] = t1;
		tab[1] = t2;
		tab[2] = t3;
		tab[3] = t4;
		tab[4] = t5;
		tab[5] = t6;
		tab[6] = t7;
		tab[7] = t8;
		tab[8] = t9;
		tab[9] = t10;
		tab[10] = t11;
		tab[11] = t12;
		tab[12] = t13;
		tab[13] = t14;
		tab[14] = t15;

		sumowanie(tab, tab.length - 1);
		System.out.println("Ogolny wynik: " + tab[0][0]);

	}

	static void sumowanie(int tab[][], int wiersz) {
		if (wiersz == 0)
			return;
		for (int kolumna = 0; kolumna < tab[wiersz].length - 1; kolumna++) {
			tab[wiersz - 1][kolumna] += (tab[wiersz][kolumna] >= tab[wiersz][kolumna + 1]) ? tab[wiersz][kolumna] : tab[wiersz][kolumna + 1];
			System.out.println("kolumna: " + kolumna + " wiersz: " + wiersz);
		}
		wiersz--;
		sumowanie(tab, wiersz);
	}
}
