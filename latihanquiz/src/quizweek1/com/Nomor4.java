package quizweek1.com;

public class Nomor4 {

	public static void main(String[] args) {

		arrayList(2, 1, "+");
	}

	static void arrayList(int b, int c, String operator) {
		java.util.ArrayList<Double> a = new java.util.ArrayList<Double>();
		a.add(5.80);
		a.add(5.20);
		a.add(3.99);

		double angka1 = a.get(b);
		double angka2 = a.get(c);

		if (operator == "+") {
			System.out.println(angka1 +" + " + angka2 +" " + "= "+ (angka1 + angka2));
		} else if (operator == "-") {
			System.out.println(angka1 +" - " + angka2 +" " + "= "+ (angka1 - angka2));

		}
		
	}
}
