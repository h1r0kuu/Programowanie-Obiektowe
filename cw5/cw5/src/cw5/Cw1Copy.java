package cw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Cw1Copy {
	private static final String FILE_NAME = "cw1.txt";
	public void write() throws FileNotFoundException {
		String fileName = FILE_NAME;
		File plik = new File(fileName);
		int arrSize = 5;
		int[] arr = randomArray(arrSize);
		PrintWriter printWriter = new PrintWriter(fileName);
		for(int i = 0; i < arrSize; i++) {
			printWriter.write( String.valueOf(arr[i]) + " " );
		}
		printWriter.close();
	}
	
	public static int[] randomArray(int size) {
		int[] arr = new int[size];
		Random random = new Random();
		for(int i = 0; i < size; i++) {
			arr[i] = random.nextInt(50);
		}
		return arr;
	}

	public static String getFileName() {
		return FILE_NAME;
	}
}
