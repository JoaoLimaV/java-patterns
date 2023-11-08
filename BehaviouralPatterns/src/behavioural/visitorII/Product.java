package behavioural.visitorII;

public interface Product {
	public double getPrice();
	
	// Method Visitor
	public double getPriceWithTaxBrazil(TaxVisitorBrazil visitor);
}
