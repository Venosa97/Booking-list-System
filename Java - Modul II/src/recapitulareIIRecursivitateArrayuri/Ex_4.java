package recapitulareIIRecursivitateArrayuri;
import java.util.Scanner;

public class Ex_4 {
	
	public static void bubbleSort(double[] values) {
		double aux;
		int counter = values.length;
	
		
		while (counter > 1) {
			boolean idk = false;
			
			for (int i = 0; i < values.length - 1; ++i) {

				if (values[i] > values[i+1]) {
					aux = values[i + 1];
					values[i+1] = values[i];
					values[i] = aux;
					idk = true;
				}
			}
			if (idk == false) {
				break;
			}
			--counter;
		}
		
		for(int i = 0; i < values.length; ++i) {
			System.out.print(values[i] + " ");
		}
	}
	
	public static void bubbleSortDescending(double[] values) {
		double aux;
		int counter = values.length;
		
		while (counter > 1) {
			boolean idk =  false;
			for (int i = 0; i < values.length - 1; ++i) {
				
				if (values[i] < values[i+1]) {
					aux = values[i + 1];
					values[i+1] = values[i];
					values[i] = aux;
					idk = true;
				}
			}
			if (idk = false) {
				break;
			}
			--counter;
		}
		
		for(int i = 0; i < values.length; ++i) {
			System.out.print(values[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n =  sc.nextInt();
		double[] array =  new double[n];
		
		for(int i = 0; i < array.length; ++i) {
			array[i] = sc.nextDouble();
		}
		sc.close();
		bubbleSort(array);
		System.out.println();
		bubbleSortDescending(array);
	}

}
