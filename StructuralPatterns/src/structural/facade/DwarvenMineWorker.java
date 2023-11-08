package structural.facade;

import java.util.Arrays;
import java.util.logging.Logger;

public abstract class DwarvenMineWorker {
	protected static final Logger LOG = Logger.getLogger(DwarvenMineWorker.class.getName());

	public void goToSleep() {
		LOG.info(name() + " goes to sleep.");
	}

	public void wakeUp() {
		LOG.info(name() + " wake up.");
	}

	public void goHome() {
		LOG.info(name() + " goes sleep.");
	}

	public void goToMine() {
		LOG.info(name() + " goes to mine.");
	}

	private void action(Action action) {
		switch(action) {
			case GO_TO_SLEEP : goToSleep(); break;
			case WAKE_UP 	 : wakeUp();	break;
			case GO_HOME 	 : goHome();	break;
			case GO_TO_MINE  : goToMine();	break;
			case WORK        : work();		break;
			default 	     : LOG.info("Undefined Action"); break;
		}
	}
	
	public void action(Action... actions){
		Arrays.stream(actions).forEach(this::action);
	}
	
	protected abstract String name();
	public abstract void work();

	enum Action{
		GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
	}
}
