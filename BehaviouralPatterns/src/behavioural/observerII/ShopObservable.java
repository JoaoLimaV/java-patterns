package behavioural.observerII;

import java.util.ArrayList;
import java.util.List;

public class ShopObservable implements Observable {

	private final List<ClientObserver> observers = new ArrayList<>();
	private String name; 
	
	public ShopObservable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void addClient(ClientObserver obsClient) {
		// TODO Auto-generated method stub
		this.observers.add(obsClient);
	}

	@Override
	public void removeClient(ClientObserver obsClient) {
		// TODO Auto-generated method stub
		this.observers.remove(obsClient);
	}

	@Override
	public void notifyAllClient() {
		// TODO Auto-generated method stub
		this.observers.forEach(e -> e.update(this));
	}

}
