package behavioural.mediatorII;

public class App {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		Seller seller = new Seller();
		
		Mediator mediator = new Mediator(seller);
		
		buyer.setMediator(mediator);
		buyer.buy();
	}
}
