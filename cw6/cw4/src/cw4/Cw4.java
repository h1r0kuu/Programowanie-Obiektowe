package cw4;

class Ksiazka {
	public String tytul;
	public String author;
	public String gatunek;
	
	public String[] wydanie = new String[10];

	public String[] getWydanie() {
		return wydanie;
	}
}

public class Cw4 {
	public static void main(String[] args) {
		String[] wydawnictwa = new String[] {"1","2","3","4","5","6","7","8","9","10"};
		Ksiazka ks1 = new Ksiazka();
		ks1.tytul = "flowers for algernon";
		ks1.author = "Daniel Keyes";
		ks1.gatunek = "science fiction";
		ks1.wydanie = wydawnictwa;
		
		System.out.println(ks1.tytul + " " + ks1.author + " " + ks1.gatunek + "\nwydawnictwa: " + ks1.wydanie.length);
		
		String[] wydawnictwa2 = new String[] {"1","2","3","4","5","6","7","8","9","10"};
		Ksiazka ks2 = new Ksiazka();
		ks2.tytul = "flowers";
		ks2.author = "Daniel";
		ks2.gatunek = "science fiction";
		ks2.wydanie = wydawnictwa2;
		
		System.out.println(ks2.tytul + " " + ks2.author + " " + ks2.gatunek + "\nwydawnictwa: " + ks2.wydanie.length);
	}
}
