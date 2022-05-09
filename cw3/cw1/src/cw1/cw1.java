package cw1;

import java.time.LocalDateTime;

public class cw1 {
	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Dzien " + date.getDayOfMonth());
		System.out.println("Miesiac " + date.getMonth());
		System.out.println("Rok " + date.getYear());
		System.out.println("Godzina " + date.getHour());
	}
}
