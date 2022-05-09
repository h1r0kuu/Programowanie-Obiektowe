package src.cw3;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

class Piornik {
	private HashMap<String, Integer> lista = new HashMap<String, Integer>(){
		{
			put("ołówek", 20);
			put("długopis", 35);
			put("gumka", 40);
			put("linijka", 10);
			put("nożczki", 50);
		}
	};

	public int getProductPrice(String str) {
		return lista.get(str);
	}
}

public class Cw3 {
	public static void main(String[] args) {
		boolean stop = false;
		Piornik piornik = new Piornik();
		int summa = 0;
		while (!stop) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Wpisz przedmiot (or STOP): ");
			String przedmiot = scanner.nextLine();

			if(przedmiot.equals("STOP")) {
				stop = true;
				System.out.println("Summa zakupow: " + summa);
				break;
			}

			int cenaPrzedmiotu = piornik.getProductPrice(przedmiot);
			if(Objects.nonNull(cenaPrzedmiotu)) {
				summa += cenaPrzedmiotu;
			}
		}
	}
}
