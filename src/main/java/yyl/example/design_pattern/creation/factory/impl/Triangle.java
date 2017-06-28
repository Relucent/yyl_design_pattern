package yyl.example.design_pattern.creation.factory.impl;

import yyl.example.design_pattern.creation.factory.Shape;

public class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Triangle::draw()");
	}
}
