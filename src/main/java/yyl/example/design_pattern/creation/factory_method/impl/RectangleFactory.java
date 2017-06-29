package yyl.example.design_pattern.creation.factory_method.impl;

import yyl.example.design_pattern.creation.factory_method.ShapeFactory;

public class RectangleFactory implements ShapeFactory {
	@Override
	public Rectangle create() {
		return new Rectangle();
	}
}
