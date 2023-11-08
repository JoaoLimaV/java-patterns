package structural.wrapper;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Advertisement adv1 = new Advertisement("Titulo 1", "Descri��o do Anuncio", 10.5);
		adv1.publish();
		adv1.inactivate();
		adv1.activate();
		adv1.delete();
		System.out.println("");
		
		Ad ad = new Ad();
		ad.description = "Smartphone A10 �timo estado de conserva��o";
		ad.price = 50.0;
		ad.status = "reviewed";
		
		Advertisement adv2 = new AdvertisementAdapter(ad);
		adv2.publish();
		adv2.inactivate();
		adv2.activate();
		adv2.delete();	
		
	}
	
}	
