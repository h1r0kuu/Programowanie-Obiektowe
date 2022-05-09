package cw5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Cw5 {
	public static void main(String[] args) throws FileNotFoundException {
		Cw1Copy cw1 = new Cw1Copy();
		cw1.write();
		String fileName = cw1.getFileName();
		
		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		Random random = new Random();
		
		String numString = scanner.nextLine();
		String[] arr = numString.split(" ");
		int randNum = random.nextInt(10);
		
		System.out.println("Rand num: " + randNum);
		System.out.println("Nums: " + numString);
		System.out.print("Nums after multiply: ");
		
		for(String str : arr) {
			int num = Integer.valueOf(str);
			System.out.print(num * randNum + " ");
		}
	}
}
