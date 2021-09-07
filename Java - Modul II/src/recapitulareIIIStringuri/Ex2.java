package recapitulareIIIStringuri;

public class Ex2 {
	
	public static boolean anagramSolver(String str1, String str2) {
			
			String str1Lower =  str1.toLowerCase();
			String str2Lower =  str2.toLowerCase();
			int counter = 0;
			
			String s1 = returnStringOnlyLetters(str1Lower);
			String s2 =  returnStringOnlyLetters(str2Lower);

			if (s1.length() == s2.length()) {
				
				for (int i = 0; i < s2.length(); ++i) {
					for (int j = 0; j < s1.length(); ++j) {
						if (s1.charAt(j) == s2.charAt(i)) {
							++counter;
							break;
						}
					}
				}
			}
	
			if (counter ==  s1.length()) {
				return true;
			}
			return false;
		}
		
	private static String returnStringOnlyLetters(String str) {
		String s1 = "";
			
		for (int i = 0; i < str.length(); ++i) {
			if (Character.isLetter(str.charAt(i))) {
				s1 += str.charAt(i);
			}
		}
		return s1;
		}
	
	public static void main(String[] args) {
		System.out.println(anagramSolver("William Shakespeare", "I am a weakish speller!"));
	}
}
