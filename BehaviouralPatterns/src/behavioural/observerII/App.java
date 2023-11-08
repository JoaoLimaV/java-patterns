package behavioural.observerII;

public class App {
	public static void main(String[] args) {
		ShopObservable shopObservable = new ShopObservable("Nike Shop");
		
		ClientObserver client1 = new ClientObserver(1);
		ClientObserver client2 = new ClientObserver(2);
		ClientObserver client3 = new ClientObserver(3);
		ClientObserver client4 = new ClientObserver(4);
		ClientObserver client5 = new ClientObserver(5);
		
		shopObservable.addClient(client1);
		shopObservable.addClient(client2);
		shopObservable.addClient(client3);
		shopObservable.addClient(client4);
		shopObservable.addClient(client5);
		
		shopObservable.notifyAllClient();
		
	}
}
