import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape implements Cloneable  {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private Color color;


	public MyShape(int x1, int x2, int y1, int y2 , Color color){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.color = color;


	}

	public abstract boolean equals(Object other);

	public abstract void draw(Graphics g);

	// clone method override Object
	protected Object clone() throws CloneNotSupportedException{
		MyShape clone = (MyShape)super.clone();
		clone.x1 = x1;
		clone.x2 = x2;
		clone.y1 = y1;
		clone.y2 = y2;
		clone.color = color;

		return clone;
	}

	// get methods
	public Color getColor(){
		return this.color;
	}

	public int getx1(){
		return x1;
	}

	public int getx2(){
		return x2;
	}

	public int gety1(){
		return y1;
	}

	public int gety2(){
		return y2;
	}

	//set methods
	public void setx1(int x1){
		this.x1 = x1;
	}

	public void setx2(int x2){
		this.x2 = x2;
	}

	public void sety1(int y1){
		this.y1 = y1;
	}

	public void sety2(int y2){
		this.y2 = y2;
	}
}


