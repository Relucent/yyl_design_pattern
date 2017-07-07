package yyl.example.design_pattern.structural.decorator;

public class ChocolateDecorator implements Beverage {

	private Beverage beverage;

	public ChocolateDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getName() {
		return "Chocolate+" + beverage.getName();
	}

}
