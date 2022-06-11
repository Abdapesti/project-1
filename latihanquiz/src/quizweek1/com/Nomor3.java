package quizweek1.com;

public class Nomor3 {

	public static void main(String[] args) {
		deretBilangan(3);
	}

	static void deretBilangan(int ukuranDeret) {

		int[] hasilDeret = new int[ukuranDeret];
		int[] even = new int[ukuranDeret];// indexnya 4
		int[] odd = new int[ukuranDeret];// indexnya 4

		int genap = 2;
		int ganjil = 1;
		int angka = 0;
		int index = 0;

		for (int i = 0; i < ukuranDeret; i++) {
			even[i] = genap;
			genap += 2;

			odd[i] = ganjil;
			ganjil += 2;
			if (index < ukuranDeret) {
				for (int j = 0; j < odd[i]; j++) {
					angka = even[i];
					index++;
					System.out.print(" " + angka);
					if (index == ukuranDeret) {
						break;
					}
				}

			}

		}

	}

}
