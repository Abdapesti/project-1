package quizarray.com;

public class Nomor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array2DTask2(9);
	}

	static void array2DTask2(int x) {
		// logic array 2D
		String[][] genap = new String[x][x];
		String[][] ganjil = new String[x][x];

		if (x % 2 == 0) {
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					genap[i][j] = "x";
					System.out.print(genap[i][j]);
				}
				System.out.println();
			}

		} else if (x % 2 != 0) {
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					ganjil[i][j] = "o";
					System.out.print(ganjil[i][j]);
				}
				System.out.println();
			}
		}
		
	}
}
