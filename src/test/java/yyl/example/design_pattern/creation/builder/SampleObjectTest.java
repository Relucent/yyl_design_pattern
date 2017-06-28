package yyl.example.design_pattern.creation.builder;

public class SampleObjectTest {
	public static void main(String[] args) {

		SampleObject.Builder builder = new SampleObject.Builder();

		builder.setName("Design Pattern");
		builder.addValue("Singleton");
		builder.addValue("Factory Method");
		builder.addValue("Abstract Factory");
		builder.addValue("Builder");
		builder.addValue("Prototype");

		SampleObject sample = builder.build();

		System.out.println(sample);
	}
}
