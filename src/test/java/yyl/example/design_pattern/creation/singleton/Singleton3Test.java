package yyl.example.design_pattern.creation.singleton;

public class Singleton3Test {

	public static void main(String[] args) {
		Singleton3 o1 = Singleton3.getInstance();
		Singleton3 o2 = Singleton3.getInstance();
		System.out.println("o1==o2 -> " + (o1 == o2));
	}
}
