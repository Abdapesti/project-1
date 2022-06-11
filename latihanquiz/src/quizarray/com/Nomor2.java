package quizarray.com;

public class Nomor2 {

	public static void main(String[] args) {
		arr2d(5);
	}

	static void arr2d(int dimensi) {
		int[][] arr = new int[dimensi][dimensi];
		for (int i = 0; i < dimensi; i++) {
			for (int j = 0; j < dimensi; j++) {
				arr[i][j] = dimensi;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
