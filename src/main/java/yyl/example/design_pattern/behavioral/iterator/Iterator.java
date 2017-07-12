package yyl.example.design_pattern.behavioral.iterator;

/**
 * 迭代器接口类
 */
public interface Iterator {

	/** 是否有元素可以迭代 */
	boolean hasNext();

	/** 返回迭代的下一个元素 */
	Object next();
}
