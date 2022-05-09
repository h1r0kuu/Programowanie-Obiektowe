package cw2;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

class ProduktSpozywczy {
	private String nazwa;
	private double waga;
	
	private double tluszcz;
	private double kwasyNasycone;
	private double weglowodany;
	private double cukry;
	private double bialko;
	private double sol;
	private double kalorie;
	
	public ProduktSpozywczy(String nazwa, double waga, double tluszcz, double kwasyNasycone, double weglowodany,
			double cukry, double bialko, double sol, double kalorie) {
		super();
		this.nazwa = nazwa;
		this.waga = waga;
		this.tluszcz = tluszcz;
		this.kwasyNasycone = kwasyNasycone;
		this.weglowodany = weglowodany;
		this.cukry = cukry;
		this.bialko = bialko;
		this.sol = sol;
		this.kalorie = kalorie;
	}
	
	public double stosunokZawatrosci(double zawartoszcz) {
		return (waga * zawartoszcz) / 100;
	}
	
	public double procent(double zawatroszcz) {
		return (zawatroszcz * 100) / waga;
	}
	
	public void info(String skladnik, double procent, double zawartoszcz) {
		System.out.println("W " + nazwa + " jest "+ skladnik +" " + new DecimalFormat("#0.00").format(zawartoszcz) + " g. ( " + new DecimalFormat("#0.00").format(procent) + "% )");
	}
}

public class Cw2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nazwa;
		double waga;
		
		double tluszcz;
		double kwasyNasycone;
		double weglowodany;
		double cukry;
		double bialko;
		double sol;
		double kalorie;
		
		System.out.print("Wpisz nazwe: ");
		nazwa = scanner.nextLine();
		System.out.print("Wpisz wage: ");
		waga = scanner.nextDouble();
		System.out.print("Wpisz wage tluszczu na 100g: ");
		tluszcz = scanner.nextDouble();
		System.out.print("Wpisz wage kwasow nasyconych, na 100g: ");
		kwasyNasycone = scanner.nextDouble();
		System.out.print("Wpisz wage weglowodanow, na 100g: ");
		weglowodany = scanner.nextDouble();
		System.out.print("Wpisz wage cukrow nasyconych, na 100g: ");
		cukry = scanner.nextDouble();
		System.out.print("Wpisz wage bialka nasyconych, na 100g: ");
		bialko = scanner.nextDouble();
		System.out.print("Wpisz wage soli nasyconych, na 100g: ");
		sol = scanner.nextDouble();
		System.out.print("Wpisz wage kalorii nasyconych, na 100g: ");
		kalorie = scanner.nextDouble();
		
		ProduktSpozywczy produkt = new ProduktSpozywczy(nazwa, waga, tluszcz, kwasyNasycone, weglowodany, cukry, bialko, sol, kalorie);
		produkt.info("tluszczu", produkt.procent(tluszcz), produkt.stosunokZawatrosci(tluszcz));
		produkt.info("kwasyNasycone", produkt.procent(kwasyNasycone), produkt.stosunokZawatrosci(kwasyNasycone));
		produkt.info("weglowodany", produkt.procent(weglowodany), produkt.stosunokZawatrosci(weglowodany));
		produkt.info("cukry", produkt.procent(cukry), produkt.stosunokZawatrosci(cukry));
		produkt.info("bialko", produkt.procent(bialko), produkt.stosunokZawatrosci(bialko));
		produkt.info("sol", produkt.procent(sol), produkt.stosunokZawatrosci(sol));
		produkt.info("kalorie", produkt.procent(kalorie), produkt.stosunokZawatrosci(kalorie));
	}
}
