package cw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cw4 {
	public static void main(String[] args) {
		boolean stop = false;
		List<Object[]> filmy = new ArrayList<Object[]>();
		while(!stop) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Podaj tytul: ");
			String tytul = scanner.nextLine();
			System.out.print("Podaj rok: ");
			int rok = scanner.nextInt();
			
			Object[] obj = new Object[2];
			obj[0] = tytul;
			obj[1] = rok;
			
			filmy.add(obj);
			
			System.out.print("Add another one?(y, n): ");
			String txtString = scanner.next();
			if(txtString.equals("n")) {
				stop = true;
				break;
			}
		}
		
		for(Object[] els : filmy) {
			for(Object elEl : els) {
				System.out.print(elEl + " ");
			}
			System.out.print('\n');
		}
		
	}
}
