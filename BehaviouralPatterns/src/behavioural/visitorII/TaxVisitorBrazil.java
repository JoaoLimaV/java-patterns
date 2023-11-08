package behavioural.visitorII;

public class TaxVisitorBrazil implements TaxVisitor{

	@Override // Method Visitor 
	public double calculateTaxSalad(SaladProduct product) {
		return product.getPrice() + product.getPrice() * 0.5;
	}
}
