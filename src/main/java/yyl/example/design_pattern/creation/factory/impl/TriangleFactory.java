package yyl.example.design_pattern.creation.factory.impl;

import yyl.example.design_pattern.creation.factory.ShapeFactory;

public class TriangleFactory implements ShapeFactory {
	@Override
	public Triangle create() {
		return new Triangle();
	}
}
