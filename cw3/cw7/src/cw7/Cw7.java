package cw7;

import java.util.Scanner;

public class Cw7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.next();
		String str3 = scanner.next();
		String str4 = scanner.next();
		String str5 = scanner.next();
		String[] strings = {str1, str2, str3, str4, str5};
		
		for(int j = 0; j < strings.length; j++) {
			int arrayIndex = j;

			for(int k = 0; k < strings.length; k++) {
				if(isMetagrama(strings[arrayIndex], strings[k])) {
					System.out.println(strings[arrayIndex] + " and " + strings[k] + " are metagrams");
				}
			}
		}
		
	}
	
	public static boolean isMetagrama(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		int numsNotSimilarLetters = 0;
		for(int i = 0; i < str1.length(); i++) {
			if( str1.charAt(i) != str2.charAt(i)) {
				numsNotSimilarLetters++;
			}
		}
		if(numsNotSimilarLetters == 1) {
			return true;
		}
		
		return false;
	}
}