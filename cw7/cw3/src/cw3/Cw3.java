package cw3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cw3 {
	public static void main(String[] args) {
		
		boolean stop = false;
		LinkedList<Object[]> list = new LinkedList<Object[]>();
		while(!stop) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Podaj nazwe: ");
			String nazwa = scanner.nextLine();
			System.out.print("Podaj ilosc: ");
			int ilosc = scanner.nextInt();
			System.out.print("Podaj cene: ");
			double cena = scanner.nextDouble();
			
			Object[] obj = new Object[3];
			obj[0] = nazwa;
			obj[1] = ilosc;
			obj[2] = cena;		
			
			list.add(obj);
			
			System.out.print("Add another one?(y, n): ");
			String txtString = scanner.next();
			if(txtString.equals("n")) {
				stop = true;
				break;
			}
		}
		for(Object[] els : list) {
			for(Object elEl : els) {
				System.out.print(elEl + " ");
			}
			System.out.print('\n');
		}
	}
}
