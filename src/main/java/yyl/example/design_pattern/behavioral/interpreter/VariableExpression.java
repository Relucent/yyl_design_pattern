package yyl.example.design_pattern.behavioral.interpreter;

/**
 * Variable (Terminal Expression)
 */
public class VariableExpression implements Expression {

	private String name;

	public VariableExpression(String name) {
		this.name = name;
	}

	@Override
	public boolean interpret(Context ctx) {
		return ctx.lookup(this);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return (this != obj && obj instanceof VariableExpression && this.name.equals(((VariableExpression) obj).name));
	}

	@Override
	public String toString() {
		return name;
	}

}
