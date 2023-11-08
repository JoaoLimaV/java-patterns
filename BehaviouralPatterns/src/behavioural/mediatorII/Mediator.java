package behavioural.mediatorII;

public class Mediator {
	
	private Seller seller; 
		
	public Mediator(Seller seller) {
		// TODO Auto-generated constructor stub
		this.seller = seller;
	}
	
	public void buy() {
		this.seller.sell();
	}
}
