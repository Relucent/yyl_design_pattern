package yyl.example.design_pattern.creation.factory.impl;

import yyl.example.design_pattern.creation.factory.ShapeFactory;

public class CircleFactory implements ShapeFactory {

	@Override
	public Circle create() {
		return new Circle();
	}

}
