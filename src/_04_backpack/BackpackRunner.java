package _04_backpack;

public class BackpackRunner {
	
	public static void main(String[] args) {
		
		new Backpack().packAndCheck();
		Backpack backpack = new Backpack();
		Pencil pencil = new Pencil();
		pencil.write("I wrote this with my pencil!");
		Ruler ruler = new Ruler();
		ruler.measure();
		Textbook textbook = new Textbook();
		textbook.read();
		backpack.putInBackpack(pencil);
		backpack.putInBackpack(ruler);
		backpack.putInBackpack(textbook);
		backpack.packAndCheck();
		
	}
}
