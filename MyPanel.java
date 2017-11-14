import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	private ArrayList<MyShape> shapesToPrint ;

	public MyPanel(ArrayList<MyShape> shapesToPrint){
		this.shapesToPrint = shapesToPrint;
	}
	
	//drawing method looping over shapes
	public void paintComponent(Graphics g){
		super.paintComponent(g); 
		for(MyShape s: shapesToPrint){
			if(s instanceof MyLine){
				MyLine line = (MyLine) s;
				line.draw(g);
			}
			else if (s instanceof MyRectangle){
				MyRectangle rect = (MyRectangle) s;
				rect.draw(g);

			}
			else if(s instanceof MyOval){
				MyOval oval = (MyOval) s;
				oval.draw(g);
			}

		}

	}


}
