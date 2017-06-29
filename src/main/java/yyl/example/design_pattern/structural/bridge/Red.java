package yyl.example.design_pattern.structural.bridge;

public class Red implements Color {
	public void bepaint(String shape) {
		System.out.println("<Red>" + shape);
	}
}
