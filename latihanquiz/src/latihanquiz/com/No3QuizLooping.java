package latihanquiz.com;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;
import java.util.Scanner;

public class No3QuizLooping {

	public static void main(String[] args) {
		//opening
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("==========================");
		System.out.println("Random Program");
		System.out.println("==========================");
		//isian
		System.out.print("Jumlah Baris 		: ");
		int baris = scan.nextInt();
		System.out.print("Jumlah Kolom		: ");
		int kolom = scan.nextInt();
		System.out.print("Nilai Maksimal		: ");
		int max = scan.nextInt();
		// ending
		System.out.println("==========================");
		System.out.println("Terimakasih telah mengisi data");
		System.out.println("Program akan membuat angka random sesuai jumlah baris dan kolom yang diinput.");
		System.out.println("Nilai angka tidak akan lebih dari nilai maksimal yang diinput dan harus lebih dari 0");
		System.out.println("==========================");
		//syntax
		
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				int angkaRandom = rand.nextInt(max) ;
				System.out.print(angkaRandom+1 + "	");
			}
			System.out.println();
			
		}
		
		
	}

}
