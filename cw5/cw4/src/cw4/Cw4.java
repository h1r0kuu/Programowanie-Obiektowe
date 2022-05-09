package cw4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cw4 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		String fileName = "cw4.txt";
		File plik = new File(fileName);

		PrintWriter printWriter = new PrintWriter(fileName);
		
		for(int i = a; i <= b; i++) {
			if(i % 2 == 0) {
				printWriter.write(i + " ");
			}
		}
		printWriter.close();
	}
}
