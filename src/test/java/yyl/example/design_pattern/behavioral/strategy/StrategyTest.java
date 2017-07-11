package yyl.example.design_pattern.behavioral.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Context context1 = new Context(new OperationAdd());
		System.out.println("2 + 1 = " + context1.executeStrategy(2, 1));
		Context context2 = new Context(new OperationSubstract());
		System.out.println("2 - 1 = " + context2.executeStrategy(2, 1));
	}
}
