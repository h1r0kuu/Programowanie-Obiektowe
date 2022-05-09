package cw6;

import java.time.LocalDateTime;

class Blog {
	private Long id;
	private String title;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	public Blog(Long id, String title, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.id = id;
		this.title = title;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public void info() {
		System.out.println("\t\t\t\s\s\s\s"+title + " \n" + createdAt + "\t" + updatedAt);
	}
}

public class Cw6 {
	public static void main(String[] args) {
		Blog blog1 = new Blog(1L, "dasdsa", LocalDateTime.now(), LocalDateTime.now());
		Blog blog2 = new Blog(2L, "dasdasnd asd nasjkdnas", LocalDateTime.now(), LocalDateTime.now());
		
		blog1.info();
		System.out.println();
		blog2.info();
	}
}
