package yyl.example.design_pattern.creation.factory_method.impl;

import yyl.example.design_pattern.creation.factory_method.Shape;

public class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Triangle::draw()");
	}
}
