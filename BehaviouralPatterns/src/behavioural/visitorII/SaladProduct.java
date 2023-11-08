package behavioural.visitorII;

public class SaladProduct  implements Product{
	private Double price;

	public SaladProduct(Double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	// Method Visitor
	public double getPriceWithTaxBrazil(TaxVisitorBrazil visitor) {
		return visitor.calculateTaxSalad(this);
	}
}
