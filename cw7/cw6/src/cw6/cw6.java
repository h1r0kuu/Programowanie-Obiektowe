package cw6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class cw6 {
	public static void main(String[] args) {
		Set<String> flowerNames = new HashSet<>(Arrays.asList("rose",
															  "peony",
															  "orchids",
															  "snowdrop",
															  "bluebell"));
		Scanner scanner = new Scanner(System.in);
		System.out.print("Wpisz nazwe kwiatki: ");
		String name = scanner.nextLine();
		for(String str : flowerNames) {
			if(name.equals(str)) {
				System.out.println("Jest");
			}
		}
	}
}
