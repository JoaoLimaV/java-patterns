package structural.facade;

public class DwarvenTunnelDigger extends DwarvenMineWorker {

	@Override
	protected String name() {
		// TODO Auto-generated method stub
		return "Dwarf tunnel digger";
	}

	@Override
	public void work() {
		LOG.info(name() + " creates a tunnel");
	}
	
}
