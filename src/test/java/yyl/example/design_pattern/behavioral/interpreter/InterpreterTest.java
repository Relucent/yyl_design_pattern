package yyl.example.design_pattern.behavioral.interpreter;

public class InterpreterTest {
	public static void main(String[] args) {
		Context ctx = new Context();
		VariableExpression x = new VariableExpression("x");
		VariableExpression y = new VariableExpression("y");
		ConstantExpression z = new ConstantExpression(true);
		ctx.assign(x, true);
		ctx.assign(y, false);

		Expression exp = new OrExpression(new AndExpression(z, x), new AndExpression(y, new NotExpression(x)));
		System.out.println("x=" + x.interpret(ctx) + ", y=" + y.interpret(ctx));
		System.out.println(exp.toString() + "=" + exp.interpret(ctx));
	}
}
