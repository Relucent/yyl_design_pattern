package yyl.example.design_pattern.behavioral.iterator;

public class IteratorTest {
	public static void main(String[] args) {
		Collection collection = new NumberCollection();
		for (Iterator iterator = collection.getIterator(); iterator.hasNext();) {
			Object value = iterator.next();
			System.out.println(value);
		}
	}
}
