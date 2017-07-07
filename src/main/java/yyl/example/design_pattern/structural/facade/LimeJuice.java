package yyl.example.design_pattern.structural.facade;

/** 青柠檬汁 */
public class LimeJuice {

	private int volume;

	public LimeJuice(int volume) {
		this.volume = volume;
	}

	public void taste() {
		System.out.println(volume + "ML LimeJuice");
	}
}
