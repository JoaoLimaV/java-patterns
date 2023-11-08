package behavioural.interpreter;

import java.util.Stack;

public class App {
	public static void main(String[] args) {

		String token = "4 3 2 - 1 + *";
		Stack<Expression> stack = new Stack<Expression>();
		String[] tokenList = token.split(" ");
	
		for (String s : tokenList) {
	
			if (isOperator(s)) {
				Expression re = stack.pop();
				Expression le = stack.pop();
				System.out.printf("popped from stack left: %s, right: %s \n", le, re);
				Expression op = getOperador(s, le, re);
				int result = op.interpret();
				System.out.printf("interpreted %s %s %s, resulting in %s \n", le, op, re, result);
				Expression resultExp = new NumberExpression(result);
				stack.push(resultExp);
				System.out.printf("push result to stack: %s \n", resultExp.interpret());
	
			} else {
				Expression i = new NumberExpression(Integer.parseInt(s));
				stack.push(i);
				System.out.printf("push to stack: %s \n", i.interpret());
			}
		}
	}

	private static Expression getOperador(String s, Expression le, Expression re) {
		switch (s) {
			case "+": return new PlusExpression(le, re);
			case "-": return new MinusExpression(le, re);
			case "*": return new MultiplyExpression(le, re);
			default: throw new IllegalArgumentException("Unexpected value: " + s);
		}
	}

	private static boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*");
	}
	
}
