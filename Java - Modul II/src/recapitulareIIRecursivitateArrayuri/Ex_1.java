package recapitulareIIRecursivitateArrayuri;
import java.util.Scanner;

public class Ex_1 {

	public static void reverseNumberR(int n) {
		int revNum = 0;
		while (n > 0) {
			revNum *= 10;
			revNum +=  n % 10;
			 n /= 10;
		}
		System.out.println(revNum);
	}
	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		int n =  sc.nextInt();
		sc.close();
		reverseNumberR(n);

	}

}
