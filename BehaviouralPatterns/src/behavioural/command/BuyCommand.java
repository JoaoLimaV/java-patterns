package behavioural.command;

public class BuyCommand implements Command{
	private StockReceiver receiver; 
	
	
	public BuyCommand(StockReceiver receiver) {
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.buy();
	}
}
