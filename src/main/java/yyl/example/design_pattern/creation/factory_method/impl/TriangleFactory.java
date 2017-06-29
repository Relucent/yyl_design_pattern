package yyl.example.design_pattern.creation.factory_method.impl;

import yyl.example.design_pattern.creation.factory_method.ShapeFactory;

public class TriangleFactory implements ShapeFactory {
	@Override
	public Triangle create() {
		return new Triangle();
	}
}
