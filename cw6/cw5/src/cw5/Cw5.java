package cw5;

class Pieczywo {
	public String nazwa;
	public double waga;
	public String skladniki;
	
	public String getNazwa() {
		return nazwa;
	}
}

public class Cw5 {
	public static void main(String[] args) {
		Pieczywo p1 = new Pieczywo();
		p1.nazwa = "Chleb wiejski";
		p1.waga = 500;
		p1.skladniki = "maka PSZENNA, naturalny zakwas ZYTNI (maka ZYTNIA, woda), woda, sol, drozdze";
		System.out.println(p1.getNazwa() + " - " + p1.waga + "\n" + p1.skladniki);
		System.out.println("\n");
		Pieczywo p2 = new Pieczywo();
		p2.nazwa = "Chleb kaszubski";
		p2.waga = 650;
		p2.skladniki = "Maka zytnia razowa150 g\r\n"
				+ "Letnia woda230 ml\r\n"
				+ "Sol1,5 lyzeczki\r\n"
				+ "Aktywny zakwas zytni130 g\r\n"
				+ "Maki zytniej typ 720300 g\r\n"
				+ "Mlodych ziemniakow100 g\r\n"
				+ "Kefiru";
		
		System.out.println(p2.getNazwa() + " - " + p2.waga + "\n" + p2.skladniki);
	}
}
