package behavioural.state;

public class LockedState extends State {
	
	
	public LockedState(Player player) {
		super(player);
		player.setPlaying(false);
	}

	@Override
	public String onLock() {
		if (!player.isPlay()) {
			return "Locked...";
		}else {
			player.changeStatus(new ReadyState(player));
			return "Stopped";
		}
		
	}
	

	@Override
	public String onPlay() {
		// TODO Auto-generated method stub
		player.changeStatus(new PlayState(player));
		player.setPlaying(true);
		return "Playing...";
	}

	@Override
	public String onNext() {
		// TODO Auto-generated method stub
		return "Locked...";
	}

	@Override
	public String onPrevious() {
		// TODO Auto-generated method stub
		return "Locked...";
	}

}
