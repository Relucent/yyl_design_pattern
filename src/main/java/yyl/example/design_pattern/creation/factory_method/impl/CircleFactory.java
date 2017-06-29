package yyl.example.design_pattern.creation.factory_method.impl;

import yyl.example.design_pattern.creation.factory_method.ShapeFactory;

public class CircleFactory implements ShapeFactory {

	@Override
	public Circle create() {
		return new Circle();
	}

}
