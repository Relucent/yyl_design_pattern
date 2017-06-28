package yyl.example.design_pattern.creation.singleton;

public class Singleton2Test {

	public static void main(String[] args) {
		Singleton2 o1 = Singleton2.getInstance();
		Singleton2 o2 = Singleton2.getInstance();
		System.out.println("o1==o2 -> " + (o1 == o2));
	}
}
