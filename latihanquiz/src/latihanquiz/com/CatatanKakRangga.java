package latihanquiz.com;

import java.util.ArrayList;
import java.util.Scanner;

public class CatatanKakRangga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sayuran = new ArrayList<String>();
		sayuran.add("bayam");
		sayuran.add("kangkung");
		sayuran.add("manggis");
		for (int i = 0; i < sayuran.size(); i++) {
			System.out.println(sayuran.get(i));
		}
		System.out.println();
		sayuran.remove(2);
		sayuran.add("kelapa");
		
		for (int i = 0; i < sayuran.size(); i++) {
			System.out.println(sayuran.get(i));
		}
	}
	
}
