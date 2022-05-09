package cw9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Cw9 {
	public static void main(String[] args) {
		List<HashMap<String, String>> skroty = new ArrayList();
		appendWords(skroty, "str.", "strona");
		appendWords(skroty, "itd.", "i tak dalej");
		appendWords(skroty, "USA", "United States of America");
		appendWords(skroty, "WF", "wychowanie fizyczne");
		appendWords(skroty, "OMG", "O mój Boże!");
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Wpisz skrót: ");
			String word = scanner.nextLine();
			
			for(HashMap<String, String> tlumacz : skroty) {
				if(tlumacz.get("skrót")
						.toLowerCase()
						.equals(word.toLowerCase().trim())) {
					System.out.println("Wytłumaczenie: " + tlumacz.get("wytłumaczenie"));
				}
			}
			
		}
	}
	
	public static void appendWords(List<HashMap<String, String>> l,
								   String skrot,
								   String wytlumaczenie) {
		HashMap<String, String> word = new HashMap<>();
		word.put("skrót", skrot);
		word.put("wytłumaczenie", wytlumaczenie);
		l.add(word);
	}
}
