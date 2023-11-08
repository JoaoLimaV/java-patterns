package behavioural.observerII;

public class ClientObserver {
	private int id; 
	
	public ClientObserver(int id) {
		this.id = id;
	}
	
	public void update(ShopObservable obsvShop) {
		System.out.printf("Id cliente: %d \nA loja %s criou uma nova promoção, confira agora!\n\n", 
					      this.id,
					      obsvShop.getName());
	}

}
