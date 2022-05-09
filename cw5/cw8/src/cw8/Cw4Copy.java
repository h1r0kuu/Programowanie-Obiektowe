package cw8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cw4Copy {
	public static final String FILE_NAME = "cw4.txt";
	
	public void write() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		String fileName = FILE_NAME;
		File plik = new File(fileName);

		PrintWriter printWriter = new PrintWriter(fileName);
		
		for(int i = a; i <= b; i++) {
			if(i % 2 == 0) {
				printWriter.write(i + " ");
			}
		}
		printWriter.close();
	}

	public static String getFileName() {
		return FILE_NAME;
	}
}
