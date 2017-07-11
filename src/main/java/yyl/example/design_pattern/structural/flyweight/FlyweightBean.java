package yyl.example.design_pattern.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元模式(FlyWeight)：是为系统中存在多个相同的对象，那么只需要共享一个对象的拷贝。
 */
public class FlyweightBean {

	private static Map<String, FlyweightBean> cache = new ConcurrentHashMap<>();

	private String value;

	public FlyweightBean(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static FlyweightBean valueOf(String value) {
		FlyweightBean bean = cache.get(value);
		if (bean == null) {
			cache.put(value, bean = new FlyweightBean(value));
		}
		return bean;
	}

}
