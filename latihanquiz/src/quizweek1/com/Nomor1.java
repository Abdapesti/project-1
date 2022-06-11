package quizweek1.com;

public class Nomor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDeret(10);
	}

	static void printDeret(int jumlahDeret) {
//		int i = 0;
//	    int angka = 1;
//		while (i < jumlahDeret) {
//			System.out.print(angka + " x ");
//			i++;
//			angka+=2;
//		}

		int angka = 1;
		for (int i = 0; i < jumlahDeret; i++) {
			System.out.print(angka +"x ");
			angka+=2;
		}
	}

}
