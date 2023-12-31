package behavioural.interpreter;

public class MinusExpression extends Expression{
	
	private final Expression leftExpression; 
	private final Expression rightExpression;
	
	public MinusExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return this.leftExpression.interpret() - this.rightExpression.interpret();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "-";
	}
	
}
