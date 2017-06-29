package yyl.example.design_pattern.structural.bridge;

public class BridgeTest {
	public static void main(String[] args) {
		Shape shape = new Rectangle();
		shape.setColor(new Red());
		shape.draw();
	}
}
