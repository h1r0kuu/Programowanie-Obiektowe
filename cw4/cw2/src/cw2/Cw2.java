package cw2;

import java.util.Random;

public class Cw2 {
	public static void main(String[] args) {
		Random random = new Random();
		int size = 100;
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = random.nextInt(40);
			if(i % 4 == 0) {
				System.out.println("Index: " + i + " - " + arr[i]);
			}
		}
	}
}
