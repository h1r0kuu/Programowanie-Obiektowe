package cw8;

import java.util.Random;
import java.util.Scanner;

public class Cw8 {
	public static void main(String[] args) {
		String[] words = {"Słownik", "Aktor", "Kowal", "Kucharz", "Szczęśliwy", "Dołącz", "Słowo", "Poniedziałek"};
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String randWord = words[random.nextInt(words.length)].toLowerCase();
		char[] chars = randWord.toCharArray();
		char[] dots = randWord.toCharArray();
		for(int i = 0; i < dots.length; i++) {
			dots[i] = '.';
		}
		printCharAray(dots);
		System.out.println("\nPrint character");

		boolean game = true;
		int guessedLetters = 0;
		int tries = 3;
		while(game) {
			int wordLetters = randWord.length();
			
			String str = scanner.next();
			
			if(str.length() == 1) {
				char ch = str.toLowerCase().charAt(0);
				
				if(isCharInWord(ch, randWord) == false) {
					tries--;

					System.out.println("you dont guess the letter, tries remained: " + tries);
					if(tries == 0) {
						game = false;
						System.out.print("You lose");
						break;
					}
				}
				
				for(int i = 0; i < chars.length; i++) {
					if(chars[i] == ch) {
						guessedLetters++;
						dots[i] = ch;
					}
				}
				
				printCharAray(dots);
				System.out.print('\n');
				
				if(guessedLetters == wordLetters) {
					game = false;
					System.out.println("You win");
				}
				
			} else {
				System.out.println("You need to write only 1 char");
			}
			
		}
	}
	
	public static void printCharAray(char[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	public static boolean isCharInWord(char ch, String word) {
		for(int i = 0; i < word.length(); i++) {
			if((int)word.charAt(i) == (int)ch) {
				return true;
			}
		}
		return false;
	}
}
