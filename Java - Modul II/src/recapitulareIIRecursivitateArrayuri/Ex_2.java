package recapitulareIIRecursivitateArrayuri;
import java.util.Scanner;

public class Ex_2 {
	
	public static void myMathPowR(int number, int power) {
		int result = 1;
		
		for (int i = 1; i <= power; ++i) {
			result *= number;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int number = sc.nextInt();
		int power =  sc.nextInt();
		sc.close();
		myMathPowR(number, power);
	}

}
