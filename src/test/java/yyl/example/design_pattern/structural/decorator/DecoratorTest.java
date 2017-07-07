package yyl.example.design_pattern.structural.decorator;

public class DecoratorTest {
	public static void main(String[] args) {
		Beverage beverage0 = new Coffee();
		Beverage beverage1 = new ChocolateDecorator(new Coffee());
		Beverage beverage2 = new MilkDecorator(new Coffee());

		System.out.println(beverage0.getName());
		System.out.println(beverage1.getName());
		System.out.println(beverage2.getName());
	}
}
