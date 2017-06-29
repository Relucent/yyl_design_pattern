package yyl.example.design_pattern.creation.abstract_factory.impl;

import yyl.example.design_pattern.creation.abstract_factory.ProductFactory;

public class Product2Factory implements ProductFactory {

	@Override
	public ProductA2 createA() {
		return new ProductA2();
	}

	@Override
	public ProductB2 createB() {
		return new ProductB2();
	}

}
