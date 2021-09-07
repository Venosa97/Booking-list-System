package recapitulareIIIStringuri;

public class Ex_4 {
	
	public static void selectiveSearching (String[] str, String word, int howManyLetters) {
		String[] selectedWords = new String[str.length];
		int counter = 0;
		String[] originalStr = str;
		str = allSmallLetters(str);
		String lastWord = "";
		
		for (int i = 0; i < str.length; ++i) {
			int countLetter = 0;
			
			for (int j = 0; j < word.length(); ++j) {
				
				
				if (str[i].charAt(j) == str[i].charAt(str[i].length() - 1)) {
					break;
				}
				
				if (word.charAt(j) == str[i].charAt(j)) {
					countLetter++;
				}
				
				if (word.charAt(j) == str[i].charAt(j) && str[i] != lastWord && countLetter == howManyLetters) {
					selectedWords[counter] = originalStr[i];
					lastWord = str[i];
					++counter;
				}
			}
		}
		
		System.out.print("[");
		for (int i = 0; i < selectedWords.length; ++i) {
			
			
			if (selectedWords[i] != null && i != counter - 1) {
				System.out.print("\"" + selectedWords[i] + "\", ");
			}
			
			if(i == counter - 1) {
				System.out.print("\"" + selectedWords[i] + "\"]");
			}
		}
	}
	
	private static String[] allSmallLetters (String[] str) {
		String[] smallLetters = new String[str.length];
		
		for (int i = 0; i < str.length; ++i) {
			smallLetters[i] = str[i].toLowerCase();
		}
		return smallLetters;
	}
	
	public static void main(String[] args) {
		
		String[] array =  {"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
		selectiveSearching(array, "plot", 2);

	}

}
