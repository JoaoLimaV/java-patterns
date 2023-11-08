// ConcretCommand

package behavioural.commandII;

public class CommandPowerLightHouse implements CommandInterface {
	public LightHouse receiver; 
	
	public CommandPowerLightHouse(LightHouse receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}
	
	
	@Override
	public void execute() {
		// TODO Auto-generated constructor stub
		this.receiver.powerOn();
	}

	@Override
	public void undo() {
		this.receiver.powerOn();
		
	}
	
	
}
