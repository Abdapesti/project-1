package quizoop.com;

public class Nomor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NamaJuri juri = new NamaJuri();
		juri.Judika();
		juri.BCL();
		juri.AhmadDani();
		juri.Ariel();
		juri.Anang();
	}
}

class DaftarNilai {
	public void list() {
		System.out.println("1. nama");
		System.out.println("2. Jenis Suara");
		System.out.println("3. Warna Suara");
		System.out.println("4. Mental");
		System.out.println("5. Pitch Control");

	}
}

class NamaJuri extends DaftarNilai {

	public void Judika() {
		NamaJuri judika = new NamaJuri();
		System.out.println("Penilaian Judika");
		judika.list();
		System.out.println();
	}

	public void BCL() {
		NamaJuri bcl = new NamaJuri();
		System.out.println("Penilaian BCL");
		bcl.list();
		System.out.println();
	}

	public void AhmadDani() {
		NamaJuri ahmaddani = new NamaJuri();
		System.out.println("Penilaian Ahmad Dani");
		ahmaddani.list();
		System.out.println();
	}

	public void Ariel() {
		NamaJuri ariel = new NamaJuri();
		System.out.println("Penilaian Ariel");
		ariel.list();
		System.out.println();
	}

	public void Anang() {
		NamaJuri anang = new NamaJuri();
		System.out.println("Penilaian Anang");
		anang.list();
		System.out.println();
	}
}
