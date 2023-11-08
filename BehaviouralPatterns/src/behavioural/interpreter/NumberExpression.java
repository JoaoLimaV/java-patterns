package behavioural.interpreter;

public class NumberExpression extends Expression {
	
	private final int number; 
	
	public NumberExpression(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}
	
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return number;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Integer.toString (number) ;
	}
	 
}
