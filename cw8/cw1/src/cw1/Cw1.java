package src.cw1;

import java.util.Scanner;

class CiagGeom {
	double q;
	double b1;
	
	public CiagGeom(double b1, double q) {
		super();
		this.q = q;
		this.b1 = b1;
	}
	
	void info() {
		System.out.println("Ciag geometryczny i jego dane: ");
		System.out.println("b1 = " + b1 + " q = " + q);
	}
	
	double entyWyraz(int n) {
		return b1 * Math.pow(q, n - 1);
	}
	
	double Suma(int n) {
		return ( b1 * (1 - Math.pow(q, n)) )/(1 - q);
	}
	
}

public class Cw1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj b1: ");
		double b1 = scanner.nextDouble();
		System.out.print("Podaj q: ");
		double q = scanner.nextDouble();
		
		CiagGeom ciag = new CiagGeom(b1, q);
		ciag.info();
		System.out.print("Ktory wyraz ciagu chcesz policzyc. Podaj n: ");
		int n = scanner.nextInt();
		System.out.println("b" + n + " = " + ciag.entyWyraz(n));
		
		System.out.print("Summa n: ");
		int n2 = scanner.nextInt();
		System.out.println("Summa " + n2 +" = " + ciag.Suma(n2) );
		
	}
}
