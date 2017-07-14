package yyl.example.design_pattern.behavioral.mediator;

public class MediatorTest {
	public static void main(String[] args) {

		Mediator mediator = new Mediator();
		Colleague colleagueA = new Colleague("A");
		Colleague colleagueB = new Colleague("B");
		mediator.addColleague(colleagueA);
		mediator.addColleague(colleagueB);

		colleagueA.notice("B", "A:Message");
	}
}
