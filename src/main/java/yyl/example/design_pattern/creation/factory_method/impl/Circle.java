package yyl.example.design_pattern.creation.factory_method.impl;

import yyl.example.design_pattern.creation.factory_method.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
