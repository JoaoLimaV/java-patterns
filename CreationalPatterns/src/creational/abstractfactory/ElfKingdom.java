package creational.abstractfactory;

public class ElfKingdom  implements KingdomFactory{
	
	public King createKing() {
		// TODO Auto-generated method stub
		return new ElfKing();
	}
	
	public Castle createCastle() {
		// TODO Auto-generated method stub
		return new ElfCastle();
	}
	
	public Army createArmy() {
		// TODO Auto-generated method stub
		return new ElfArmy();
	}
 }
