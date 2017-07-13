package yyl.example.design_pattern.behavioral.command;

public class CommandTest {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();

		Command decrement = new DecrementCommand(receiver);
		Command increment = new IncrementCommand(receiver);

		Invoker invoker = new Invoker();
		invoker.setCommand(decrement);
		invoker.executeCommand();
		System.out.println(receiver.getValue());

		invoker.setCommand(increment);
		invoker.executeCommand();
		System.out.println(receiver.getValue());
	}
}
