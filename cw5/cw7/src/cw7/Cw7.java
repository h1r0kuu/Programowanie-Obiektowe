package cw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cw7 {
	public static void main(String[] args) throws FileNotFoundException {
		Cw3Copy cw3 = new Cw3Copy();
		cw3.write();
		
		String fileName = cw3.getFileName();
		
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		
		System.out.println("First matrix");
		getAndPrintArray(scanner);
		scanner.nextLine();
		scanner.nextLine();
		System.out.print("\n");
		
		System.out.println("Second matrix");
		getAndPrintArray(scanner);
	
		scanner.nextLine();
		scanner.nextLine();
		System.out.print("\n");
		
		System.out.println("First matrix * Second matrix");
		getAndPrintArray(scanner);
	}
	
	public static void getAndPrintArray(Scanner scanner) {
		String[] rozmiar = scanner.nextLine().split("x");
		int a = Integer.valueOf(rozmiar[0]), b = Integer.valueOf(rozmiar[1]);
		int[][] array = new int[a][b];
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
