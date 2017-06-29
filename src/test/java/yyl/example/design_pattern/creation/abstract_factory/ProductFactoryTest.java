package yyl.example.design_pattern.creation.abstract_factory;

import yyl.example.design_pattern.creation.abstract_factory.impl.Product1Factory;

public class ProductFactoryTest {

	public static void main(String[] args) {
		ProductFactory factory = new Product1Factory();
		ProductA a = factory.createA();
		ProductB b = factory.createB();
		System.out.println(a.getClass());
		System.out.println(b.getClass());
	}
}
