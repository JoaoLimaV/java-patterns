package behavioural.mediatorII;


public class Seller {
	private String[] product = new  String[] {"1","Bala"};

	public String descSeller() {
		return "Vendedor: João Santos";
	}
	
	public String showProduct() {
		return "Id" + this.product[0] + " Nome: " + this.product[1];
	}
	
	public void sell() {
		System.out.println("Vendido produto:" + this.product[1]);
	}
}	
