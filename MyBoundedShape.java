import java.awt.Color;

public abstract class MyBoundedShape extends MyShape {
	private boolean filled;
	public MyBoundedShape(int x1, int x2, int y1, int y2, Color color , boolean filled) {
		super(x1, x2, y1, y2, color);
		this.filled = filled;
	}


	//get the state
	public boolean getFilled(){
		return filled;
	}


	// change state function
	public void changeFilled(){
		if(this.getFilled()){
			this.filled = false;
		}
		else
			this.filled = true;

	}

}
