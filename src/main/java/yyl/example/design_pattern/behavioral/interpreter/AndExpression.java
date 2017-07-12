package yyl.example.design_pattern.behavioral.interpreter;

/**
 * And (Nonterminal Expression)
 */
public class AndExpression implements Expression {

	private Expression left;
	private Expression right;

	public AndExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean interpret(Context ctx) {
		return left.interpret(ctx) && right.interpret(ctx);
	}

	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof AndExpression//
				&& left.equals(((AndExpression) obj).left) //
				&& right.equals(((AndExpression) obj).right);//
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
