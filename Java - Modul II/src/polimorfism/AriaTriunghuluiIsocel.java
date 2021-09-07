package polimorfism;

public class AriaTriunghuluiIsocel {
	
	
	//polimorfism static
	public static void arieTriunghiIsoscel (int baza, int inaltime) {
		int rezultat = baza * inaltime / 2;
		System.out.println("Rezultatul este: " + rezultat);
	}
	
	public static void arieTriunghiIsoscel (double baza, double inaltime) {
		double rezultat = baza * inaltime / 2;
		System.out.println("Rezultatul este: " + rezultat);
	}
	
	public static void arieTriunghiIsoscel (float baza, float inaltime) {
		float rezultat = baza * inaltime / 2;
		System.out.println("Rezultatul este: " + rezultat);
	}
	
	public static void arieTriunghiIsoscel (long baza, long inaltime) {
		long rezultat = baza * inaltime / 2;
		System.out.println("Rezultatul este: " + rezultat);
	}
	public static void main(String[] args) {
		arieTriunghiIsoscel(4, 10);
		arieTriunghiIsoscel(312312.2512,2312412.223);
		arieTriunghiIsoscel(2321.23f, 5435.3523f);
		arieTriunghiIsoscel(2186457543l,54935934953l);

	}

}
