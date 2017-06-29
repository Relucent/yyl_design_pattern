package yyl.example.design_pattern.structural.bridge;

public abstract class Shape {
	protected Color color;

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw();
}
