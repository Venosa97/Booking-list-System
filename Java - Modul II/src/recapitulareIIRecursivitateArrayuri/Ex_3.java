package recapitulareIIRecursivitateArrayuri;
import java.util.Scanner;

public class Ex_3 {
	
	public static void zerosFirstInArray(int[] array) {
		int[] zeroFirst = new int[array.length];
		int counter = 0;
		
		for (int i = 0; i < array.length; ++i) {
			if (array[i] == 0) {
				zeroFirst[counter] = array[i];
				++counter;
			}
		}
		for (int i = 0; i < array.length; ++i) {
			if (array[i] != 0) {
				zeroFirst[counter] =  array[i];
				++counter;
			}
		}
		// afisare array
		for (int i = 0; i < zeroFirst.length; ++i) {
			System.out.print(zeroFirst[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int[] array =  new int[n];
		
		for (int i = 0; i < array.length; ++i) {
			array[i] =  sc.nextInt();
		}
		sc.close();
		zerosFirstInArray(array);
	}

}
//[0 2 1 0 -1 14 0 -6]