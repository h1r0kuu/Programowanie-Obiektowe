package cw5;

import java.util.Random;

public class Cw5 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int columns = 5;
		
		int[][] arr = new int[columns][];
		for(int i = 0; i < columns; i++) {
			int rows = random.nextInt(5)+ 5;
			arr[i] = new int[rows];
			for(int j = 0; j < rows; j++) {
				arr[i][j] = random.nextInt(5) + 5;
			}
		}
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
