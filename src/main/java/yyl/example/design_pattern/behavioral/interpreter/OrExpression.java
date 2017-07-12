package yyl.example.design_pattern.behavioral.interpreter;

/**
 * Or (Nonterminal Expression)
 */
public class OrExpression implements Expression {

	private Expression left;
	private Expression right;

	public OrExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(Context ctx) {
		return left.interpret(ctx) || right.interpret(ctx);
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof OrExpression//
				&& left.equals(((OrExpression) obj).left) //
				&& right.equals(((OrExpression) obj).right);//
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public String toString() {
		return "(" + left.toString() + " AND " + right.toString() + ")";
	}

}
