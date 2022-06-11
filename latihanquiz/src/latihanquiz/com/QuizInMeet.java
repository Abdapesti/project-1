package latihanquiz.com;

import java.util.ArrayList;


public class QuizInMeet {

	public static void main(String[] args) {
	
//		System.out.println("Nominasi Piala Oscar");
//	    System.out.println("--------------------");
//	    
//	    Scanner scan = new Scanner(System.in);
//	    System.out.print("Nama : ");
//	    String nama = scan.nextLine();
//	    
//	    System.out.print("Poin acting : ");
//	    int poinActing = scan.nextInt();
//	    
//	    System.out.print("Poin gimmick : ");
//	    int poinGimmick = scan.nextInt();
//	    
//	    System.out.print("Poin drama : ");
//	    int poinDrama = scan.nextInt();
////	    
//	    System.out.print("Poin character : ");
//	    int poinCharacter = scan.nextInt();
////	    
//	    int poinRata2 = poinActing+poinGimmick+poinDrama+poinCharacter;
//	    if ( poinRata2/4 >= 8) {
//			System.out.println("Artis : "+nama);
//			System.out.println("Poin Rata-Rata : "+ poinRata2/4 +"/10");
//			System.out.println(nama+" Dapat Piala");
//		} else {
//			System.out.println("tidak dapat piala");
//		}
//	    int i = 0;
//	    int hargaAsli = 100000;
//	    int tips = 10000;
//	    int total = hargaAsli+ tips;
	    
//	   static void printDeretMenurun(int jumlahBaris, int jumlahKolom) {
		
//		for (int i = 1; i <= jumlahBaris; i++) {
//			int j = 1;
//			int angka = 12;
//			while (j <= jumlahKolom) {
//				System.out.print(angka + " ");
//			angka-= 1;
//			j++;
//				if (i==2) {
//					int k = 1;
//					int angka2 = 9;
//					while (k <= jumlahKolom) {
//						System.out.print(angka2 + " ");
//					angka2-= 1;
//					k++;
//				if (i==3) {
//					int m = 1;
//					int angka3 = 6;
//					while (m <= jumlahKolom) {
//						System.out.print(angka3 + " ");
//					angka3-= 1;
//					m++;
//				
//				if (i==4) {
//					int n = 1;
//					int angka4 = 12;
//					while (n <= jumlahKolom) {
//						System.out.print(angka4 + " ");
//					angka4-= 1;
//					n++;
//				}
//				}
//				}
//			}
//			
//			
//		}
//	
//	    int hargaAsli = 100000;
//	    System.out.println("Harga asli : " + hargaAsli);
//	    for (int i= 0; i<=4;i++) {
//			for (int j = 0;  j < i; j++) {
//				hargaAsli = hargaAsli + 10000;
//				System.out.print("+ tips = " + " " + hargaAsli );
//			}
//			System.out.println();
//		}
		
		ArrayList<String> pembeli = new ArrayList<String>();
		
		pembeli.add("ayam geprek");
		pembeli.add("ayam geprek");
		pembeli.add("ayam geprek");
		pembeli.add("ayam bakar");
		pembeli.add("ayam bakar");
		pembeli.add("ayam bakar");
		pembeli.add("ayam bakar");
		pembeli.add("sate taichan");
		pembeli.add("sate taichan");
		pembeli.add("sate taichan");
		for (int i = 7; i < 9; i++) {
			pembeli.remove(i);
		}
		for (int i = 0; i < pembeli.size(); i++) {
			System.out.println(pembeli.get(i));
		}
	}
}
