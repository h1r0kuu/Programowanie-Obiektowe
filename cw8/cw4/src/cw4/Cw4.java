package cw4;

import java.time.LocalDateTime;

class Wiersze {
	private String author;
	private String title;
	
	private LocalDateTime publisheDateTime;

	public Wiersze(String author, String title, LocalDateTime publisheDateTime) {
		super();
		this.author = author;
		this.title = title;
		this.publisheDateTime = publisheDateTime;
	}
	
	public String getAuthorTitle() {
		return title + " " + author;
	}
	
	public String getPublisheTime() {
		return publisheDateTime.toString();
	}
}

public class Cw4 {
	public static void main(String[] args) {
		Wiersze wiersze = new Wiersze("Wislawa Szymborska", "Nic dwa razy", LocalDateTime.of(1997, 5, 6, 13, 43));
		System.out.println(wiersze.getAuthorTitle());;
		System.out.println(wiersze.getPublisheTime());
	}
}
