package yyl.example.design_pattern.structural.facade;

/** 君度橙酒 */
public class Cointreau {

	private int volume;

	public Cointreau(int volume) {
		this.volume = volume;
	}

	public void taste() {
		System.out.println(volume + "ML Cointreau");
	}
}
