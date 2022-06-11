package latihanquiz.com;

import java.util.ArrayList;

public class QuizMeetDay9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers(3,4,5,6);
	}
	public static void numbers(int a, int b, int c,int d) {
		ArrayList<Integer> simpan = new ArrayList<Integer>();
		simpan.add(a);
		simpan.add(b);
		simpan.add(c);
		simpan.add(d);
		
		for (Integer item : simpan) {
			item *= item;
	
			System.out.print(item + ", ");
		}
		
	}
}
