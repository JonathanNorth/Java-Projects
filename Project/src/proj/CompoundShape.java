package proj;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class CompoundShape extends Shape{

	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public void addShape(Shape newShape){
		
		shapes.add(newShape);
	}
	
	public CompoundShape(Color colour) {
		super(colour);
	}

	boolean onThePerimeter(Coordinates mousePosition) {
		for(Shape eachShape : shapes)
			if(eachShape.perimeterSelected)
				return true;
		return false;
			
	}


	void moveShape(Coordinates currentPositionMouse) {
			for(Shape eachShape : shapes)
				eachShape.moveShape(currentPositionMouse);
	}

	public void showMe(Graphics g) {
		for(Shape eachShape : shapes)
			eachShape.showMe(g);
	}
	
	
	public void resetShapeSelected(){
		for(Shape eachShape : shapes)
			eachShape.resetShapeSelected();
	}
	
	double calculateArea() {
		int totalArea = 0;
		for(Shape eachShape : shapes)
			totalArea += eachShape.calculateArea();
		return totalArea;
	}

	public boolean shapeIsSelected(Coordinates positionOfMouse) {
		for(Shape eachShape : shapes){
			if(eachShape.shapeIsSelected(positionOfMouse)){
				for(Shape eachShapeInCompound : shapes){
					shapeSelected = true;
					lastMousePosition = positionOfMouse;
				}
				return true;
			}
				
		}
		shapeSelected = false;
		return false;
	}
	
	public void changeColorTemporarily(){
		for(Shape eachShape : shapes)
			eachShape.changeColorTemporarily();
	}
	
	public String toString() {
		String returnString = "";
		for(Shape eachShape : shapes)
			returnString += eachShape.toString();
		return returnString;
	}
	


}
