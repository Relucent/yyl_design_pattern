package yyl.example.design_pattern.creation.singleton;

public class Singleton5Test {

	public static void main(String[] args) {
		Singleton5 o1 = Singleton5.getInstance();
		Singleton5 o2 = Singleton5.getInstance();
		System.out.println("o1==o2 -> " + (o1 == o2));
	}

}
