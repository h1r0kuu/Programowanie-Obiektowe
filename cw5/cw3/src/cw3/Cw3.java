package cw3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Cw3 {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "cw3.txt";
		File plik = new File(fileName);
		PrintWriter printWriter = new PrintWriter(fileName);
		int arrSize = 3;
		int[][] first = randomArray(arrSize);
		int[][] second = randomArray(arrSize);
		int[][] multiplyRes = multiplyArrays(first, second);
		
		printWriter.write(first.length + "x" + first[0].length + "\n");
		writeArray(first, printWriter);
		printWriter.write("\n");
		printWriter.write(second.length + "x" + second[0].length + "\n");
		writeArray(second, printWriter);
		printWriter.write("\n");
		printWriter.write(multiplyRes.length + "x" + multiplyRes[0].length + "\n");
		writeArray(multiplyRes, printWriter);
		printWriter.close();
	}
	
	public static void writeArray(int[][] arr, PrintWriter writer) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				writer.write(arr[i][j] + " ");
			}
			writer.write("\n");
		}
	}
	
	public static int[][] randomArray(int size) {
		int[][] arr = new int[size][size];
		Random random = new Random();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = random.nextInt(15);
			}
		}
		return arr;	
	}
	
	public static int[][] multiplyArrays(int[][] first, int[][] second) {
		if(first.length == second[0].length) {
			int[][] resArray = new int[first.length][second[0].length];
			for(int i = 0; i < first.length; i++) {
				for(int j = 0; j < first[i].length; j++) {
					for(int k = 0; k < first[i].length; k++) {
						resArray[i][j] += first[i][k] * second[k][j];
					}
				}
			}
			return resArray;
		}
		return null;
	}
}
