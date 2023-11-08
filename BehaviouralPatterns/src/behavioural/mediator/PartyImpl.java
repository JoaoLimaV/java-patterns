package behavioural.mediator;

import java.util.List;
import java.util.ArrayList;

public class PartyImpl implements Party{
	private final List<PartyMember> members;
	
	public PartyImpl() {
		members = new ArrayList<>();
	}
	
	@Override
	public void addMember(PartyMember member) {
		members.add(member);
		member.joinedParty(this);
	}

	@Override
	public void act(PartyMember actor, Action action) {
		// TODO Auto-generated method stub
		for (PartyMember member : members) {
			if (!member.equals(actor)) {
				member.partyAction(action);
			}
		}
	}

}
