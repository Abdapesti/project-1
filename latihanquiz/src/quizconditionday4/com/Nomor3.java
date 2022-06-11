package quizconditionday4.com;

public class Nomor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		answer(3);
	}

	static void answer(int juara) {

		int hadiah = 0;
		switch (juara) {
		case 1:
			System.out.println(hadiah + 20000000);
			break;
		case 2:
			System.out.println(hadiah + 10000000);
			break;
		case 3:
			System.out.println(hadiah + 5000000);
			break;
		default:
			System.out.println(hadiah + 1000000);
			break;
		}
	}
}
