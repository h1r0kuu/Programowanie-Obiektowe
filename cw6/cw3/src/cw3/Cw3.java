package cw3;

class Film {
	public String title;
	public String country;
	public String genre;
	
	public int views;
	public double rating;
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}

public class Cw3 {
	public static void main(String[] args) {
		Film film1 = new Film();
		film1.title = "Terminator";
		film1.country = "USA";
		film1.genre = "action";
		film1.views = 100000000;
		film1.rating = 5.9;
		System.out.println(film1.getRating());
		System.out.println(film1.views + "\n");
		
		Film film2 = new Film();
		film1.title = "Attack on titan";
		film1.country = "Japan";
		film1.genre = "action";
		film1.views = 10000000;
		film1.rating = 6.9;
		System.out.println(film2.getRating());
		System.out.println(film2.views + "\n");
	}
}
