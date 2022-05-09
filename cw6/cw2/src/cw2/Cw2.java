package cw2;

class Ubrania {
	public String color;
	public String size;
	public String sex;
	
	public int views;
	public double price;
	
	public double getPrice() {
		return price;
	}
	
	public String getSex() {
		return sex;
	}
}

public class Cw2 {
	public static void main(String[] args) {
		Ubrania ub1 = new Ubrania();
		
		ub1.color = "black";
		ub1.size = "M";
		ub1.sex = "male";
		ub1.views = 1000;
		ub1.price = 100.0;
		System.out.println(ub1.getSex());
		System.out.println(ub1.getPrice());
		System.out.println("views: " + ub1.views + "\n");
		
		Ubrania ub2 = new Ubrania();
		ub2.color = "green";
		ub2.size = "XXL";
		ub2.sex = "female";
		ub2.views = 10000;
		ub2.price = 500.0;
		System.out.println(ub2.getSex());
		System.out.println(ub2.getPrice());
		System.out.println("views: " + ub2.views);
	}
}
