package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class DwarvenGoldmineFacade {
	
	private List<DwarvenMineWorker> workers;
	
	public DwarvenGoldmineFacade() {
		workers = new ArrayList<>();
		
		workers.add(new DwarvenGoldDigger());
		workers.add(new DwarvenCartOperator());
		workers.add(new DwarvenTunnelDigger());
	}

	public void startNewDay() {
		workers.forEach(w -> 
		w.action(DwarvenMineWorker.Action.WAKE_UP,
				 DwarvenMineWorker.Action.GO_TO_SLEEP));
		
	}
	
	public void dig() {
		workers.forEach(w -> 
		w.action(DwarvenMineWorker.Action.WORK));
	}
	
	public void endDay() {
		workers.forEach(w -> 
		w.action(DwarvenMineWorker.Action.GO_HOME,
				 DwarvenMineWorker.Action.GO_TO_SLEEP));
	}
}