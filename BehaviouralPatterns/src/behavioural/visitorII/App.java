package behavioural.visitorII;

public class App {
	
	public static void main(String[] args) {
		TaxVisitorBrazil taxVisitorBrazil = new TaxVisitorBrazil();		
		
		
		SaladProduct saladProduct = new SaladProduct(10.0);
		
		System.out.println("Preço produto bruto: " + saladProduct.getPrice());
		System.out.printf("Preço produto c\\ Taxas Brasileiras: %.2f",
					      saladProduct.getPriceWithTaxBrazil(taxVisitorBrazil));
	}
}
