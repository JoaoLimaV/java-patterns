package structural.wrapper;

public class Ad {
	String description;
	Double price;
	String status;
	
	public void publish() {
		System.out.println("Ad publish");
	}
	
	public void delete() {
		System.out.println("delete publish");
	}
	
}
