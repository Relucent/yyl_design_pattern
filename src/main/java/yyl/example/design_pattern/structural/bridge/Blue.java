package yyl.example.design_pattern.structural.bridge;

public class Blue implements Color {
	public void bepaint(String shape) {
		System.out.println("<Blue>" + shape);
	}
}