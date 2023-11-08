package behavioural.observer;

public class FiscalObserver implements Observer<Product> {

	@Override
	public void update(Product t) {
		// TODO Auto-generated method stub
		System.out.println("\nIssuing fiscal invoce for " + t); 
	}

}
