package quizweek2no2.com.mainpackage;

public class SameClass {
	String nama;
	String nim;
	int mtk;
	int bindo;
	int pbo;
	int rata2;

	public static void main(String[] args) {

		SameClass p = new SameClass();
		p.Nama();
		p.NPMNIM();
		p.MTK();
		p.Bindo();
		p.PBO();
		System.out.println();
		p.Mean();

	}

	public void Nama() {
		nama = "Krisna";
		System.out.println("Nama\t\t\t" + nama);
	}

	public void NPMNIM() {
		nim = "14.125781.101";
		System.out.println("NPM/NIM\t\t\t" + nim);
	}

	public void MTK() {
		mtk = 70;
		System.out.println("Nilai Matematika\t" + mtk);

	}

	public void Bindo() {
		bindo = 60;
		System.out.println("Nilai Bahasa Indonesia\t" + bindo);
	}

	public void PBO() {
		pbo = 65;
		System.out.println("Nilai PBO\t\t" + pbo);
	}

	public void Mean() {
		rata2 = (mtk + bindo + pbo) / 3;
		System.out.println("Nilai Rata-Rata\t\t" + rata2);
	}
}
