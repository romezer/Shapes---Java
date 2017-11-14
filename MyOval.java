import java.awt.Color;
import java.awt.Graphics;



public class MyOval extends MyBoundedShape {

	public MyOval(int x1, int x2, int y1, int y2, Color color, boolean filled) {
		super(x1, x2, y1, y2, color, filled);

	}
	// equal method overrides Objects equal
	public boolean equals(Object other){
		if(other instanceof MyOval){
			MyOval myOther = (MyOval) other;
			int x2 = getx2();
			int y2 = gety2();
			return x2 == myOther.getx2() && y2 == myOther.gety2();
		}
		else return false;

	}

	// self drawing method
	public void draw(Graphics g){
		g.setColor(this.getColor());
		if(this.getFilled()){
			g.fillOval(this.getx1(), this.gety1(),this.getx2(),this.gety2());
		}
		else
			g.drawOval(this.getx1(), this.gety1(), this.getx2(), this.gety2());
	}




}
