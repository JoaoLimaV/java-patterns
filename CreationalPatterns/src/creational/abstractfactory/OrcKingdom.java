package creational.abstractfactory;

public class OrcKingdom  implements KingdomFactory{
	
	public King createKing() {
		// TODO Auto-generated method stub
		return new OrcKing();
	}
	
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new OrcCastle();
	}
	
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new OrcArmy();
	}
 }
