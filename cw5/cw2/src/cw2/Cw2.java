package cw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Cw2 {
	private static final int LAST_ALBUM_DIGITS = 10;
	
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "cw2.txt";
		File plik = new File(fileName);
		PrintWriter printWriter = new PrintWriter(fileName);
		int arrSize = 5;
		int[][] arr = randomArray(arrSize);
		for(int i = 0; i < arrSize; i++) {
			for(int j = 0; j < arrSize; j++) {
				printWriter.write( String.valueOf(arr[i][j]) + " " );
			}
			printWriter.write("\n");
		}
		printWriter.close();
	}
	
	public static int[][] randomArray(int size) {
		int[][] arr = new int[size][size];
		Random random = new Random();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = random.nextInt(50) + LAST_ALBUM_DIGITS;
			}
		}
		//arr[random.nextInt(size)][random.nextInt(size)] = LAST_ALBUM_DIGITS;
		return arr;	
	}
}
