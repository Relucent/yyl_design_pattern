package yyl.example.design_pattern.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境(Context)用来存放文法中各个终结符所对应的具体值 (此处定义出从变量到布尔值的一个映射)<br>
 */
public class Context {

	private Map<VariableExpression, Boolean> map = new HashMap<>();

	public void assign(VariableExpression var, boolean value) {
		map.put(var, new Boolean(value));
	}

	public boolean lookup(VariableExpression var) throws IllegalArgumentException {
		Boolean value = map.get(var);
		if (value == null) {
			throw new IllegalArgumentException();
		}
		return value.booleanValue();
	}
}
