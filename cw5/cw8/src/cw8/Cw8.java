package cw8;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Cw8 {
	public static void main(String[] args) throws IOException {
		Cw4Copy cw4 = new Cw4Copy();
		cw4.write();
		
		String fileName = cw4.getFileName();
		
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		
		String str = scanner.nextLine();
		String[] nums = str.split(" ");
		int length = nums.length;
		int[] array = new int[length];
		int counter = 0;
		for(String s : nums) {
			array[counter] = Integer.valueOf(s);
			counter++;
		}
		for(int i = 0; i < length; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
