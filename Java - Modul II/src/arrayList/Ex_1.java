package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ex_1 {
	
	public static void CharAppearance(String theStr) {
		
		ArrayList<Character> arrayListChar = new ArrayList<Character>();
		int max = 0;
		
		for(int i = 0; i < theStr.length(); i++) {
			if(Character.isWhitespace(theStr.charAt(i))) {
				continue;
			}
			int counter = 1;
			
			for(int j = i + 1; j < theStr.length(); j++) {
				if(theStr.charAt(i) == theStr.charAt(j)) {
					counter++;
				}
			}
			
			if(counter > max) {
				max = counter;
				arrayListChar.clear();
				arrayListChar.add(theStr.charAt(i));
				
			} else if(counter == max) {
				arrayListChar.add(theStr.charAt(i));
			}
		}
		System.out.println("Litera " + arrayListChar + " apare de " + max + " ori");
	}
		
	
	public static void main(String[] args) {
		String theStr = "Becoming a programmer is like gaining super powers!";
		CharAppearance(theStr);
	}
}