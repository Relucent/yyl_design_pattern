package yyl.example.design_pattern.creation.prototype;

public abstract class Shape implements Cloneable {

	protected String type;

	public void draw() {
		System.out.println(type + "::draw()");
	}

	public String getType() {
		return type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
