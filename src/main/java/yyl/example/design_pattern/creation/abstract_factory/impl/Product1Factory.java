package yyl.example.design_pattern.creation.abstract_factory.impl;

import yyl.example.design_pattern.creation.abstract_factory.ProductFactory;

public class Product1Factory implements ProductFactory {

	@Override
	public ProductA1 createA() {
		return new ProductA1();
	}

	@Override
	public ProductB1 createB() {
		return new ProductB1();
	}

}
