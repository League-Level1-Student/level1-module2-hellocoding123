package _99_extra;

public class PixelRunner {
	
	static public void main(String[] args) {
		
		PixelParty party = new PixelParty();
		party.drawCircle(200, 400, 50);
		party.drawLine(400, 400, 250, 100);
		party.drawRectangle(350, 50, 100, 100);
		party.drawTriangle(0, 200, 100, 0, 200, 200);
		party.drawTriangle(0, 50, 100, 250, 200, 50);
		party.saveImage();
		party.displayImage();
	}

}
