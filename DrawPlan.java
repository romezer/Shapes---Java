import java.util.ArrayList;
import javax.swing.JFrame;

public class DrawPlan {
	private JFrame window;
	private ArrayList<MyShape> shapesToPrint;

	public DrawPlan(){
		shapesToPrint = new ArrayList<>();
	}
	//draw execution function
	public void execute(){
		JFrame frame = new JFrame();
        frame.add(new MyPanel(shapesToPrint));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
	
	}
	// add shapes to draw list
	public void addShape(MyShape shape){
		shapesToPrint.add(shape);
	}


}
