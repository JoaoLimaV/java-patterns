package behavioural.mediator;

import java.util.logging.Logger;

public abstract class PartyMemberBase implements PartyMember {
	protected Logger LOG = Logger.getLogger(
				PartyMemberBase.class.getName());
	
	protected Party party; 
	
	@Override
	public void joinedParty(Party party) {
		LOG.info(String.format("%s joins the party", this));		
		this.party = party;
	}
	
	@Override
	public void partyAction(Action action) {
		// TODO Auto-generated method stub
		String reaction; 
		
		switch ( action ) {
			case ENEMY: reaction = "runs for cover"; break;
			case TALE : reaction = "comes to listen"; break;
			case GOLD : reaction = "takes this share"; break;
			case HUNT : reaction = "arriver for dinner"; break;
			default: reaction = "nothing to do";
		}
		
		LOG.info(String.format("%s %s", this, reaction));
	}
	
	 @Override
	public void act(Action action) {
		// TODO Auto-generated method stub
		 if(party != null) {
			 LOG.info(String.format("%s %s", this, action));
		 }
	}
}


