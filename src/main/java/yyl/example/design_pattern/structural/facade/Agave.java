package yyl.example.design_pattern.structural.facade;

/** 龙舌兰 */
public class Agave {

	private int volume;

	public Agave(int volume) {
		this.volume = volume;
	}

	public void taste() {
		System.out.println(volume + "ML Agave");
	}
}
