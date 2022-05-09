package cw7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Cw7 {
	public static void main(String[] args) {

		boolean stop = false;
		Set<String> ubrania = new HashSet();
	
		while(!stop) { 
			Scanner scanner = new Scanner(System.in);
			System.out.print("Podaj nazwe ubrania: ");
			String nazwa = scanner.nextLine();
			ubrania.add(nazwa);
			
			System.out.print("Add another one?(y, n): ");
			String txtString = scanner.next();
			if(txtString.equals("n")) {
				stop = true;
				break;
			}
		}
		
		for(String str : ubrania) {
			System.out.println("Nazwa ubrania: " + str);
		}
		
	}
}
