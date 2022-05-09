package cw1;

import java.util.Random;

public class Cw1 {
	public static void main(String[] args) {
		Random random = new Random();
		int size = 10;
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = random.nextInt(40);
			System.out.println("do: " + array[i] + " po: " + ((float)array[i] / (float)2));
		}
	}
}
