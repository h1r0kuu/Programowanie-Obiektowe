package cw2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cw2 {
	public static void main(String[] args) {
		boolean stop = false;
		List<Object[]> pracownikList = new ArrayList<Object[]>();
		while(!stop) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Podaj imie: ");
			String imie = scanner.nextLine();
			System.out.print("Podaj nazwisko: ");
			String nazwisko = scanner.nextLine();
			System.out.print("Podaj staz pracy: ");
			int staz = scanner.nextInt();
			
			Object[] obj = new Object[3];
			obj[0] = imie;
			obj[1] = nazwisko;
			obj[2] = staz;
			
			pracownikList.add(obj);
			
			System.out.print("Add another one?(y, n): ");
			String txtString = scanner.next();
			if(txtString.equals("n")) {
				stop = true;
				break;
			}
		
		}
		for(Object[] els : pracownikList) {
			for(Object el : els) {
				System.out.print(el + " ");
			}
			System.out.print("\n");
		}
	}
}
