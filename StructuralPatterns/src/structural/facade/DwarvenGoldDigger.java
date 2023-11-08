package structural.facade;

public class DwarvenGoldDigger extends DwarvenMineWorker {

	@Override
	protected String name() {
		// TODO Auto-generated method stub
		return "Dwarf gold digger";
	}

	@Override
	public void work() {
		LOG.info(name() + " digs for gold");
	}
	
}
