package cw6;

import java.util.Random;
import java.util.Scanner;

public class Cw6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int num = scanner.nextInt();
		for(int i = 0; i <= 10; i++) {
			int randNum = random.nextInt(50);
			if(randNum - num > 0) {
				System.out.println("rand num: " + randNum + " res: " + (randNum - num) + " Wynik: " + "+");
			} else {
				System.out.println("rand num: " + randNum + " res: " + (randNum - num) + " Wynik: " + "-");
			}
		}
	}
}
