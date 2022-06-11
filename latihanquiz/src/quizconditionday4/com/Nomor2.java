package quizconditionday4.com;

import java.util.Iterator;

public class Nomor2 {

	public static void main(String[] args) {
		answer(11);
	}

	static void answer(int loop) {
		String angka = "";
		if (loop % 2 == 0) {
			if (loop > 10) {
				angka = "GENAP";
		
			} else
				angka = "genap";
		}
		
		if (loop %2 != 0) {
			if (loop > 10) {
				angka = "GANJIL";
				
			}else 
			angka = "ganil";
		
		} 
		 for (int i = 1; i <= loop; i++) {
			if (i%5 == 0) {
				System.out.println(angka + "!");
			}else
				System.out.println(angka);
		}
		
	}
}
