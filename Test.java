import java.awt.Color;
import java.util.ArrayList;
import java.security.SecureRandom;

public class Test {
	private static ArrayList<MyShape> originalShapes;
	private static ArrayList<MyShape> clonedShapes;	
	private static SecureRandom randomNumber = new SecureRandom();
	private final static int upperLimit = 200;

	public static void main(String[] args) {
		DrawPlan p = new DrawPlan();
		
		originalShapes = new ArrayList<>();
		clonedShapes = new ArrayList<>();
		MyShape line1 = new MyLine(randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),Color.black);
		MyShape line2 = new MyLine(randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),Color.red);
		MyShape oval1 = new MyOval(randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),Color.green,true);
		MyShape oval2 = new MyOval(randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),Color.blue,true);
		MyShape rect1 = new MyRectangle(randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),Color.yellow,true);
		MyShape rect2 = new MyRectangle(randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),randomNumber.nextInt(upperLimit),Color.pink,true);
		originalShapes.add(line1);
		originalShapes.add(line2);
		originalShapes.add(oval1);
		originalShapes.add(oval2);
		originalShapes.add(rect1);
		originalShapes.add(rect2);
		for(int i = 0 ; i < originalShapes.size() ; i ++){
			try {
				clonedShapes.add((MyShape)originalShapes.get(i).clone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			
		}
		for(int i = 0 ; i < clonedShapes.size() ; i ++){
			clonedShapes.get(i).setx1(clonedShapes.get(i).getx1() + 10);
			clonedShapes.get(i).sety1(clonedShapes.get(i).gety1() + 10);
			if(clonedShapes.get(i) instanceof MyBoundedShape){
				MyBoundedShape temp = (MyBoundedShape) clonedShapes.get(i);
				temp.changeFilled();
			}
		}
		for(int i = 0 ; i < originalShapes.size() ; i ++){
			p.addShape(originalShapes.get(i));
		}
		for(int i = 0 ; i < clonedShapes.size() ; i ++){
			p.addShape(clonedShapes.get(i));
		}
		p.execute(); // execution draw plan
		
		
		
	}

}
