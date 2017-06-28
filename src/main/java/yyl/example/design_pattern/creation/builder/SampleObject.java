package yyl.example.design_pattern.creation.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式(Builder Pattern)使用多个简单的对象一步一步构建成一个复杂的对象。<br>
 */
public class SampleObject {

	private String name;
	private List<String> values;

	public String getName() {
		return name;
	}

	public List<String> getValues() {
		return values;
	}

	@Override
	public String toString() {
		return "SampleObject [name=" + name + ", values=" + values + "]";
	}

	public static class Builder {
		private String name;
		private List<String> values = new ArrayList<>();

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder addValue(String value) {
			this.values.add(value);
			return this;
		}

		public SampleObject build() {
			SampleObject sample = new SampleObject();
			sample.name = this.name;
			sample.values = this.values;
			return sample;
		}
	}
}
