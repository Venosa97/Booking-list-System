package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex_0 {

	public static void main(String[] args) {
		ArrayList<String> ElectrocasniceDisponibile = new ArrayList<String>(Arrays.asList("frigider", "aspirator", "congelator", "cuptor"));
		ElectrocasniceDisponibile.add(0, "MasinaDeSpalat");
		ElectrocasniceDisponibile.add("MasinDeSpalatVase");
		ElectrocasniceDisponibile.add("frigider");
		
		System.out.println(ElectrocasniceDisponibile.size());
		System.out.println(ElectrocasniceDisponibile.contains("aspirator"));
		System.out.println(ElectrocasniceDisponibile.get(0));
		System.out.println(ElectrocasniceDisponibile.indexOf("cuptor"));
		System.out.println(ElectrocasniceDisponibile.lastIndexOf("frigider"));
		
		ElectrocasniceDisponibile.remove("frigider");
		ElectrocasniceDisponibile.remove(2);
		ElectrocasniceDisponibile.set(0, "Hota");
		
		for (int i = 0; i < ElectrocasniceDisponibile.size(); ++i) {
			System.out.print(ElectrocasniceDisponibile.get(i) + " ");
		}
		System.out.println(ElectrocasniceDisponibile.listIterator());
//		ElectrocasniceDisponibile.clear();
		
		
	}

}
