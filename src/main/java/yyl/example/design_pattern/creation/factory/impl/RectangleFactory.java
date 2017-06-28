package yyl.example.design_pattern.creation.factory.impl;

import yyl.example.design_pattern.creation.factory.ShapeFactory;

public class RectangleFactory implements ShapeFactory {
	@Override
	public Rectangle create() {
		return new Rectangle();
	}
}
