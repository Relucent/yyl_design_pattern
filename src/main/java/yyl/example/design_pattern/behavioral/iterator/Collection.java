package yyl.example.design_pattern.behavioral.iterator;

/**
 * 集合类
 */
public interface Collection {

	/**
	 * 工厂方法，创建相应迭代子对象的接口
	 */
	Iterator getIterator();
}
