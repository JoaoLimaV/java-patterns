package structural.facade;

public class DwarvenCartOperator extends DwarvenMineWorker {

	@Override
	protected String name() {
		// TODO Auto-generated method stub
		return "Dwarf cart operator";
	}

	@Override
	public void work() {
		LOG.info(name() + " moves gold.");
	}
	
}
