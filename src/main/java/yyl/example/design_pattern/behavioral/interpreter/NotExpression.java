package yyl.example.design_pattern.behavioral.interpreter;

/**
 * Not (Nonterminal Expression)
 */
public class NotExpression implements Expression {

	private Expression expression;

	public NotExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public boolean interpret(Context ctx) {
		return !expression.interpret(ctx);
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof NotExpression//
				&& expression.equals(((NotExpression) obj).expression);
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public String toString() {
		return "(Not " + expression.toString() + ")";
	}

}
