package yyl.example.design_pattern.behavioral.iterator;

/**
 * 数字的集合类
 */
public class NumberCollection implements Collection {

	private Number[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	@Override
	public Iterator getIterator() {
		return new Iterator() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < values.length;
			}

			@Override
			public Object next() {
				if (hasNext()) {
					return values[index++];
				}
				return null;
			}

		};
	}
}
