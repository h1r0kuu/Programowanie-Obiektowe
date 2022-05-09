package cw5;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cw5 {
	public static void main(String[] args) {
		boolean stop = false;
		List<Object[]> utworyMuz = new LinkedList<Object[]>();
		
		while(!stop) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Podaj tytul: ");
			String tytul = scanner.nextLine();
			System.out.print("Podaj arystow: ");
			String artysty = scanner.nextLine();
			System.out.print("Podaj gatunek: ");
			String gatunek = scanner.nextLine();
			
			
			Object[] obj = new Object[3];
			obj[0] = tytul;
			obj[1] = artysty;
			obj[2] = gatunek;
			
			utworyMuz.add(obj);
			
			System.out.print("Add another one?(y, n): ");
			String txtString = scanner.next();
			if(txtString.equals("n")) {
				stop = true;
				break;
			}
		}
		for(Object[] els : utworyMuz) {
			for(Object elEl : els) {
				System.out.print(elEl + " ");
			}
			System.out.print('\n');
		}
	}
}
