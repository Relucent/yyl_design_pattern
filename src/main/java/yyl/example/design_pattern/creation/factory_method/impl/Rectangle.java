package yyl.example.design_pattern.creation.factory_method.impl;

import yyl.example.design_pattern.creation.factory_method.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}
