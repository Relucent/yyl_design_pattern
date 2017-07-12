package yyl.example.design_pattern.behavioral.interpreter;

/**
 * Constant (Terminal Expression)
 */
public class ConstantExpression implements Expression {

	private final boolean value;

	public ConstantExpression(boolean value) {
		this.value = value;
	}

	@Override
	public boolean interpret(Context ctx) {
		return value;
	}

	@Override
	public int hashCode() {
		return Boolean.hashCode(value);
	}

	@Override
	public boolean equals(Object obj) {
		return this != obj && obj instanceof ConstantExpression && this.value == ((ConstantExpression) obj).value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
