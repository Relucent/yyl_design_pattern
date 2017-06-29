package yyl.example.design_pattern.structural.adapter;

public class AdaperTest {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adaper(adaptee);
		target.execute();
	}

}
