package behavioural.command;

public class RentCommand implements Command{
	private StockReceiver receiver; 
	
	public RentCommand(StockReceiver receiver) {
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.rent();
	}
}
