package yyl.example.design_pattern.creation.singleton;

public class Singleton1Test {

	public static void main(String[] args) {
		Singleton1 o1 = Singleton1.getInstance();
		Singleton1 o2 = Singleton1.getInstance();
		System.out.println("o1==o2 -> " + (o1 == o2));
	}
}
