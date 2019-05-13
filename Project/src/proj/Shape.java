package proj;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	
	public static final int maxNumberOfShapes = 20;
	protected Coordinates referencePoint;
	protected Coordinates lastMousePosition; // If a shape has 
	// been  selected, the position where the 
	// user has pressed the mouse to select the shape
	
	
	protected Color colour;
	protected Color originalColour;
			
	protected boolean shapeSelected = false;
	protected boolean perimeterSelected = false;

	abstract boolean onThePerimeter(Coordinates mousePosition);

	public Shape(Color colour){
		referencePoint = new Coordinates(200,200);
		this.colour = colour;
	}
	
	/* 
	 * resetShapeSelected() simply resets the value of shapeSelected to false.
	 */
	public void resetShapeSelected(){
		shapeSelected = false;
	}
	
	/*
	 * savePositionWhereUserPressedMouse(int x, int y)is used to 
	 * save the position where the user Pressed the mouse button.
	 * This is useful for moving the rectangle.
	 */
	public void savePositionWhereUserPressedMouse(int x, int y){
		lastMousePosition = new Coordinates(x, y);
	}
	
	/* 
	 * changeColor(c) modifies the color of the rectangle to the new color c
	 */	
	public void changeColor(Color c){
		colour = c;
	}
	
	public void changeColorTemporarily(){
		originalColour = colour;
		colour = Color.yellow;
		perimeterSelected = false;
	}
	
	public void changeColorBack(){
		colour = originalColour;
		perimeterSelected = false;
	}
	
	/*
	 * Method moveShape(currentPositionMouse) allows the user to drag the rectangle by dragging the mouse
	 * button. The shape is first selected by pressing the mouse button with the cursor inside the shape.
	 * Then, if the user drags the mouse, the shape should move with the mouse.
	 * Moving a rectangle simply means modifying the reference point (upper left corner point) so that
	 * rectangle moves with the mouse position.
	 * The idea is that if the x and the y coordinate of the position of the mouse is moved by specified
	 * amounts,the reference point must change by exactly the same amount.
	 */
	
	abstract void moveShape(Coordinates currentPositionMouse);
	
	/* 
	 * Method shapeIsSelected() returns true if the user previously selected the shape by 
	 * pressing the mouse button with the cursor inside the shape.
	 */
	
	public boolean shapeIsSelected(){
		return shapeSelected;
	}
	
	abstract public void showMe(Graphics g);
	abstract double calculateArea();
	
	abstract public boolean shapeIsSelected(Coordinates positionOfMouse);
	abstract public String toString();
}
