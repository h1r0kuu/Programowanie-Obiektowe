package cw2;

import java.util.Scanner;

public class Cw2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str= scanner.nextLine();
		String[] imieNazwisko = str.split(" ", 2);
		System.out.println(upperCase(imieNazwisko[0]) + " " + upperCase(imieNazwisko[1]) );
		
	}
	
	public static String upperCase(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
}
