package cw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cw9 {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "cw9.txt";
		File plik = new File(fileName);
		PrintWriter printWriter = new PrintWriter(fileName);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Wpisz imie: ");
		String imie = scanner.nextLine();
		
		System.out.print("Wpisz nazwisko: ");
		String nazwisko = scanner.nextLine();
		
		System.out.print("Wpisz numer albumu: ");
		String numerAlbumu = scanner.nextLine();
		
		System.out.print("Wpisz kierunek: ");
		String kierunek = scanner.nextLine();

		int maxLength = "Kierunek Studiów".length();
		int maxUserTextLength = maxUserTextLength(imie, 
												  nazwisko,
												  numerAlbumu,
												  kierunek);
		
		int linesCount = maxLength + maxUserTextLength + 5;
		String lines = line(linesCount);
		printWriter.write( border("Imie", maxLength, imie, maxUserTextLength, lines) );
		printWriter.write( border("Nazwisko", maxLength, nazwisko, maxUserTextLength, lines) );
		printWriter.write( border("Numer albumu", maxLength, numerAlbumu, maxUserTextLength, lines) );
		printWriter.write( border("Kierunek Studiow", maxLength, kierunek, maxUserTextLength, lines) );
		printWriter.write( lines );
		printWriter.close();
	}
	
	public static String border(String left,
								int maxLength,
								String right,
								int userMaxLength,
								String lines) {
		String str = lines + "\n";
		str += "|" + addSpaces(left, maxLength) + "| " + addSpaces(right, userMaxLength) + " |\n";
		return str;
		
	}

	public static String line(int length) {
		String str = "";
		for(int i = 0; i < length; i++) {
			str += '-';
		}
		return str;
		
	}
	
	public static String addSpaces(String str, int maxLength) {
		if(str.length() < maxLength) {
			int spaces = maxLength - str.length();
			for(int i = 0; i < spaces; i++) {
				str += " ";
			}
			return str;
		}
		return str;
	}
	
	public static int maxUserTextLength(String ...strs) {
		int maxLength = 0;
		for(String str : strs) {
			if(str.length() > maxLength) {
				maxLength = str.length();
			}
		}
		return maxLength;
	}
}
