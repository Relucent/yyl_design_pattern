package yyl.example.design_pattern.creation.factory.impl;

import yyl.example.design_pattern.creation.factory.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
