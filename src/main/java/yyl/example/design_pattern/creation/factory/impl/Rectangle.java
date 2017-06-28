package yyl.example.design_pattern.creation.factory.impl;

import yyl.example.design_pattern.creation.factory.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}
