package behavioural.observer;

import java.util.ArrayDeque;
import java.util.Queue;

public class ProductSubject extends Subject<Product> implements Runnable{
	private final Queue<Product> queue = new ArrayDeque<>();
	
	public ProductSubject() {
		Thread t = new Thread(this);
		t.start();
	}
	
	public void add(Product product) {
		queue.add(product);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while( true ) {
			System.out.println("\nCheking queue for new products...");
			int size = this.queue.size();
			
			if(size > 0) {
				for (int i = 0; i < size; i++) {
					Product p = this.queue.poll();
					this.notifyObservers(p);
				}
			}else {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
