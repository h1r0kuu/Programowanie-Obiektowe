package cw1;

class TelKomorkowy {
	public String model;
	public String country;
	public String color;
	public int cena;
	public int RAM;
	
	public String modelColor() {
		return model + " " + color;
	}
	
}

public class Cw1 {
	
	public static void main(String[] args) {
		TelKomorkowy tel1 = new TelKomorkowy();
		tel1.model = "XIAOMI Redmi 9A";
		tel1.country = "China";
		tel1.color = "black";
		tel1.cena = 500;
		tel1.RAM = 2;
		
		System.out.print(tel1.modelColor());
		System.out.println(" cena: " + tel1.cena);
		
		TelKomorkowy tel2 = new TelKomorkowy();
		tel2.model = "Samsung Galaxy S21+";
		tel2.country = "USA";
		tel2.color= "gray";
		tel2.cena = 300;
		tel2.RAM = 2;
		
		System.out.print(tel2.modelColor());
		System.out.println(" cena: " + tel2.cena);
		
	}
}
