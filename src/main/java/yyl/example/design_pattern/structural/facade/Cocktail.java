package yyl.example.design_pattern.structural.facade;

/** 鸡尾酒 ：是一种混合饮品，是由两种或两种以上的酒或饮料、果汁、汽水混合而成 */
public class Cocktail {

	private Agave agave;
	private Cointreau cointreau;
	private LimeJuice limeJuice;

	public Cocktail() {
		agave = new Agave(40);
		cointreau = new Cointreau(20);
		limeJuice = new LimeJuice(20);
	}

	public void taste() {
		agave.taste();
		cointreau.taste();
		limeJuice.taste();

	}
}
