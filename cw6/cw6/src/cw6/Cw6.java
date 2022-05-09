package cw6;

class Malarstwo {
	public String tytul;
	public String autor;
	public int rok;
	public String technika;
	public double cena;
	
	public String getTytul() {
		return tytul;
	}
	
	public double getCena() {
		return cena;
	}
}

public class Cw6 {
	public static void main(String[] args) {
		Malarstwo m1 = new Malarstwo();
		m1.tytul = "Nenufary i migot";
		m1.autor = "Anita Domeracka";
		m1.rok = 2021;
		m1.technika = "Olej";
		m1.cena = 2960;
		System.out.println(m1.getTytul() + " " + m1.getCena() + "\n" + m1.autor + " " + m1.rok + " " + m1.technika);
		System.out.println("\n");
		Malarstwo m2 = new Malarstwo();
		m2.tytul = "Kolibry";
		m2.autor = "Patrycja Proszynska";
		m2.rok = 2021;
		m2.technika = "Akryl";
		m2.cena = 2250;
		System.out.println(m2.getTytul() + " " + m2.getCena() + "\n" + m2.autor + " " + m2.rok + " " + m2.technika);
	}
}
