package behavioural.mediatorII;

public class Buyer {
	
	private Mediator mediator;
	
	public void setMediator(Mediator mediator) { 
		this.mediator = mediator;
	}
	
	public void buy() {
		this.mediator.buy();
	}
}
