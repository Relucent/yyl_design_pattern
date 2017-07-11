package yyl.example.design_pattern.behavioral.strategy;

/**
 * 加法运算(策略实现类)
 */
public class OperationSubstract implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}