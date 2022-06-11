package quizconditionday4.com;

public class Nomor1 {

	public static void main(String[] args) {
		
		answer(3);
	}

	static void answer(int juara) {
		
		 int hadiah = 0;
		    if (juara == 1) {
		    	hadiah = hadiah+20000000;
				System.out.println(hadiah);
				
			} else if (juara != 1 && juara < 4) {
				hadiah = hadiah+20000000 - 5000000*juara;
				System.out.println(hadiah);
			} else {
				System.out.println("1000000");

			}
		   
	}
}
