package _03_tea_maker;

public class TeaMakerRunner {
	static public void main(String[] args) {
		TeaBag teabag = new TeaBag("Mint");
		teabag.getFlavor();
		Kettle kettle = new Kettle();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(teabag, kettle.getWater());
	}
}
