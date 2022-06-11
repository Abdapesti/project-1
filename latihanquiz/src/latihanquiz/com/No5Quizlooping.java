package latihanquiz.com;

import java.util.Scanner;

public class No5Quizlooping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String done = "cukup";
		int uang = 20000;
		// opening
		System.out.println("==========================");
		System.out.println("Program Penggandaan Uang");
		System.out.println("==========================");
		System.out.println("Jumlah Uang Anda Sekarang : 10000");
		System.out.println("Ketik 'cukup' untuk berhenti, ketik apapun untuk menggandakan lagi.");
		// Syntax
		while (scan.hasNext()) {
			String input = scan.nextLine();

			if (input.equals(done)) {
				System.out.println("Program penggandaan selesai...");
				break;
			} else {
				int i = 0;
				while (i < 1) {
					System.out.println("Jumlah Uang Anda Sekarang : " + uang);
					System.out.println("Ketik 'cukup' untuk berhenti, ketik apapun untuk menggandakan lagi.");
					uang *= 2;
					i++;
				}
			}

		}

	}

}
