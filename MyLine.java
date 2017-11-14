import java.awt.Color;
import java.awt.Graphics;


public class MyLine extends MyShape {

	public MyLine(int x1, int x2, int y1, int y2, Color color) {
		super(x1, x2, y1, y2, color);

	}
	// equal method overrides Objects equal
	public boolean equals(Object other){
		if(other instanceof MyLine){
			MyLine myOther = (MyLine) other;
			int x1 = getx1();
			int x2 = getx2();
			int y1 = gety1();
			int y2 = gety2();
			return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2)) == Math.sqrt(Math.pow(myOther.getx2() - myOther.getx1(),2) + Math.pow(myOther.gety2() - myOther.gety1(),2));

		}
		else return false;
	}

	// self drawing method
	public void draw(Graphics g){
		g.setColor(this.getColor());
		g.drawLine(this.getx1(), this.gety1(), this.getx2(), this.gety2());

	}


}
