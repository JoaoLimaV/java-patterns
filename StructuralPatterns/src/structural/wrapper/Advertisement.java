package structural.wrapper;

public class Advertisement {
	String title; 
	String description;
	Double price;
	AdversisementStatus status = AdversisementStatus.DRAFT;
	
	public Advertisement(String title, String description, Double price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}
	
	public void publish() {
		System.out.println("Advertisement publishment process...");
	}
	
	public void inactivate() {
		System.out.println("Advertisement inactivate process...");
	}
	
	public void activate() {
		System.out.println("Advertisement activate process...");
	}
	
	public void delete() {
		System.out.println("Advertisement delete process...");
	}
	
}
