package behavioural.observerII;

public interface Observable {

	public void addClient(ClientObserver obsClient);
	public void removeClient(ClientObserver obsClient);
	public void notifyAllClient();
	
}
