package behavioural.interpreter;

public class MultiplyExpression extends Expression{

	private final Expression leftExpression; 
	private final Expression rightExpression;
	
	public MultiplyExpression(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return this.leftExpression.interpret() * this.rightExpression.interpret();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "*";
	}
}
