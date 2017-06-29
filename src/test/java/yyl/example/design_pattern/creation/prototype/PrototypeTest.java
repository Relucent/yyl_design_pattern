package yyl.example.design_pattern.creation.prototype;

public class PrototypeTest {
	public static void main(String[] args) {
		Shape shape1 = new Rectangle();
		Shape shape2 = (Shape) shape1.clone();
		shape1.draw();
		shape2.draw();
	}
}
