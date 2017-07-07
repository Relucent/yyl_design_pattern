package yyl.example.design_pattern.structural.decorator;

public class MilkDecorator implements Beverage {

	private Beverage beverage;

	public MilkDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getName() {
		return "Milk+" + beverage.getName();
	}

}
