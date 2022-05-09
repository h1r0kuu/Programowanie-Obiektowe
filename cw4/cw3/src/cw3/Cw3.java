package cw3;

import java.util.Random;

public class Cw3 {
	public static void main(String[] args) {
		Random random = new Random();
		int size = 20;
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = random.nextInt(100) + 1;
			if(arr[i] > 50) {
				System.out.println(arr[i]);
			}
		}
	}
}
