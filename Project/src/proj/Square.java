package proj;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape{
	
	private Rectangle rectangle;
	
	public Square(Color c) {
		super(c);
		rectangle = new Rectangle(c);
	}
	
	boolean onThePerimeter(Coordinates mousePosition){
		
		if (rectangle.topEdgeSelected(mousePosition)) return true;

		if (rectangle.leftEdgeSelected(mousePosition)) return true;

		if (rectangle.bottomEdgeSelected(mousePosition)) return true;

		if (rectangle.rightEdgeSelected(mousePosition)) return true;
		return false;
	}

	public void showMe(Graphics g) {
		rectangle.showMe(g);
	}

	double calculateArea() {
		return rectangle.calculateArea();
	}
	
	
	public void changeSize(int newHeightandWidth){
		rectangle.changeHeight(newHeightandWidth);
		rectangle.changeWidth(newHeightandWidth);
	}

	public void changeColorTemporarily(){
		rectangle.originalColour = rectangle.colour;
		rectangle.colour = Color.yellow;
		colour = Color.yellow;
		rectangle.perimeterSelected = false;
	}
	
	public void changeColorBack(){
		colour = originalColour;
		perimeterSelected = false;
		rectangle.colour = rectangle.originalColour;
		rectangle.perimeterSelected = false;
	}
	
	public boolean shapeIsSelected(Coordinates positionOfMouse) {
		
		boolean isShapeSelected = rectangle.shapeIsSelected(positionOfMouse);
		
		if(isShapeSelected){
			shapeSelected = true;
			lastMousePosition = positionOfMouse;
			return true;
		}
		else{
			shapeSelected = false;
			return false;
		}
	}
	

	void moveShape(Coordinates currentPositionMouse){
		rectangle.moveShape(currentPositionMouse);
	}

	public String toString() {
		return "Square with refernce point " + rectangle.referencePoint + " having width " + rectangle.getWidth() + "and height " + rectangle.getHeight() + "\n";
	}
	
	
	
	
	

}
