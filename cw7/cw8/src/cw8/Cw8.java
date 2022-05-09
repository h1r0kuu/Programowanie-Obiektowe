package cw8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Cw8 {
	public static void main(String[] args) {
		List<HashMap<String, String>> words = new ArrayList();
		appendWords(words, "main", "główny");
		appendWords(words, "meat", "mięso");
		appendWords(words, "enjoy", "czerpać z czegoś przyjemność");
		appendWords(words, "husband", "mąz");
		appendWords(words, "position", "pozycja");
		appendWords(words, "member", "członek");
		appendWords(words, "hope", "nadzieja, mieć nadzieję");
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Wpisz słowo, które chcesz przetłumaczyć: ");
			String word = scanner.nextLine();
			
			for(HashMap<String, String> tlumacz : words) {
				if(tlumacz.get("eng").equals(word.toLowerCase().trim())) {
					System.out.println("Tłumaczenie: " + tlumacz.get("pl"));
				}
			}
			
		}
	}
	
	public static void appendWords(List<HashMap<String, String>> l,
								   String engWord,
								   String plWord) {
		HashMap<String, String> word = new HashMap<>();
		word.put("eng", engWord);
		word.put("pl", plWord);
		l.add(word);
	}
}
