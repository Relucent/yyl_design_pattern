package yyl.example.design_pattern.creation.factory;

import yyl.example.design_pattern.creation.factory.impl.CircleFactory;
import yyl.example.design_pattern.creation.factory.impl.RectangleFactory;
import yyl.example.design_pattern.creation.factory.impl.TriangleFactory;

public class ShapeFactoryTest {
	public static void main(String[] args) {
		ShapeFactory factory1 = new CircleFactory();
		ShapeFactory factory2 = new RectangleFactory();
		ShapeFactory factory3 = new TriangleFactory();

		Shape shape1 = factory1.create();
		Shape shape2 = factory2.create();
		Shape shape3 = factory3.create();

		shape1.draw();
		shape2.draw();
		shape3.draw();
	}
}
