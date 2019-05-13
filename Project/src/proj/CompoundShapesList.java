package proj;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class CompoundShapesList{

	ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public void addShapes(Shape shapeToBeAdded){
		shapes.add(shapeToBeAdded);
	}
	
	public void includeShapeInComposite(Shape leafShape, CompoundShape compoundShape){
		compoundShape.addShape(leafShape);
	}
	
	public void moveShape(Coordinates currentPositionMouse){
		for(Shape eachShape : shapes)
			if(eachShape.shapeIsSelected())
				eachShape.moveShape(currentPositionMouse);
		
	}
	
	public double getTotaArea(Shape shape){
		return shape.calculateArea();
	}
	

	public boolean shapeIsSelected(Coordinates currentMousePosition){
		for(Shape eachShape : shapes){
			eachShape.shapeIsSelected(currentMousePosition);
		}
		return false;
	}
	
	public String getShapeString(Shape shape){
		return shape.toString();
	}
	
	
	boolean checkIfOnThePerimeter(Coordinates mousePosition){
		for(Shape eachShape : shapes){
			if(eachShape.onThePerimeter(mousePosition))
				return true;				
		}
		return false;
	}
	
	public void showMeAll(Graphics g){
		for(Shape eachShape : shapes)
			eachShape.showMe(g);
	}
	
	public void resetAllShapesSelected(){
		for(Shape eachShape : shapes)
			eachShape.resetShapeSelected();
	}
	
	public void changeSelectedColorTemporarily(Coordinates currentMousePosition){
		for(Shape eachShape : shapes)
			if(eachShape.onThePerimeter(currentMousePosition))
				eachShape.changeColorTemporarily();
	}
	
}
