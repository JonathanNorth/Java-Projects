package proj;

import java.awt.*;
/*
 * Written by Subir Bandyopadhyay Sept 1, 2012
 * Class Rectangle represents a rectangle. 
 * 
 * Properties of class Rectangle
 * referencePoint - where is the rectangle located
 * size  - the height and the width of the rectangle
 * lastMousePosition - the last position where the mouse was pressed, 
 * 						useful when moving the rectangle
 * colorRectangle - color of the rectangle
 * shapeSelected - a boolean variable which is true if the rectangle is 
 * 					selected for moving 
 * 
 * Properties of class Rectangle (See below for more details)
 * onAnEdge - returns true if mouse is pressed very close to one of the edges
 * changeColor - modify the color of the rectangle
 * changeShape - modify the width or the height of the rectangle
 * moveShape - move the rectangle by dragging the mouse 
 * shapeIsSelected - mark a rectangle as "selected" by pressing the mouse button inside the rectangle
 * resetShapeSelected - reset the shapeSelected flag
 * calculateArea - determine the area of the rectangle
 * showMe - display the rectangle inside the frame
 * toString - return a string describing the rectangle.
 * savePositionWhereUserPressedMouse - useful when dragging the shape
 * 
 */


public class Rectangle extends Shape{

	private int height, width;  // height and width of rectangle

	// Constructor creates a black rectangle with size 50 X 50 with upper left point at (200, 200)
	public Rectangle(Color c){
		super(c);
		height = 50;
		width = 50;
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getWidth(){
		return width;
	}
	/*
	 * Method onThePerimeter checks if the user pressed the mouse button on the perimeter. 
	 * If so, it returns true; otherwise it return false.
	 */

	void moveShape(Coordinates currentPositionMouse){
			// If a shape is selected for a move operation, change the reference point as the mouse is being dragged
			referencePoint.setX(referencePoint.getX() + 
					currentPositionMouse.getX() -
					lastMousePosition.getX());
			referencePoint.setY(referencePoint.getY() +
					currentPositionMouse.getY() -
					lastMousePosition.getY());
			lastMousePosition = currentPositionMouse;
		
		
	}
	boolean onThePerimeter(Coordinates mousePosition){
		
		/*
		 * If the position where the user pressed the mouse button is within 5 pixels of 
		 * any side of the rectangle, the method will return true;
		 * Otherwise, it will return false.
		 */
		if (topEdgeSelected(mousePosition)) return true;

				if (leftEdgeSelected(mousePosition)) return true;

				if (bottomEdgeSelected(mousePosition)) return true;

				if (rightEdgeSelected(mousePosition)) return true;

				return false;
	}
	
	public boolean topEdgeSelected(Coordinates mousePosition){
		int xWhereMousePressed = mousePosition.getX();
		int yWhereMousePressed = mousePosition.getY();
		if (((xWhereMousePressed >= referencePoint.getX() - 5) &&
				(xWhereMousePressed <= (referencePoint.getX() + width + 5)) &&
				(yWhereMousePressed >= referencePoint.getY() - 5) &&
				(yWhereMousePressed <= (referencePoint.getY() + 5)))) return true;
		return false;
	}
	
	public boolean leftEdgeSelected(Coordinates mousePosition){
		int xWhereMousePressed = mousePosition.getX();
		int yWhereMousePressed = mousePosition.getY();
		
		if ((xWhereMousePressed >= referencePoint.getX() - 5) &&
				(xWhereMousePressed <= (referencePoint.getX() + 5)) &&
				(yWhereMousePressed >= referencePoint.getY() - 5) &&
				(yWhereMousePressed <= (referencePoint.getY() + height + 5))) return true;// left edge is edge # 1
		return false;
	}
	
	public boolean bottomEdgeSelected(Coordinates mousePosition){
		int xWhereMousePressed = mousePosition.getX();
		int yWhereMousePressed = mousePosition.getY();
		
		if((xWhereMousePressed >= referencePoint.getX() - 5) &&
				(xWhereMousePressed <= (referencePoint.getX() + width + 5)) &&
				(yWhereMousePressed >= referencePoint.getY() + height - 5) &&
				(yWhereMousePressed <= (referencePoint.getY()+ height + 5))) return true;
		return false;
	}
	
	public boolean rightEdgeSelected(Coordinates mousePosition){
		
		int xWhereMousePressed = mousePosition.getX();
		int yWhereMousePressed = mousePosition.getY();
		
		if ((xWhereMousePressed >= referencePoint.getX() + width - 5) &&
				(xWhereMousePressed <= (referencePoint.getX() + width + 5)) &&
				(yWhereMousePressed >= referencePoint.getY() - 5) &&
				(yWhereMousePressed <= (referencePoint.getY() + height + 5))) return true;
		return false;
	}
	
	public void changeWidth(int newWidth){
			width = newWidth;
	}
	public void changeHeight(int newHeight){
		height = newHeight;
	}
	

	
	/*
	 * Method shapeIsSelected(positionOfMouse) checks if the position of the mouse where the user
	 * pressed the left mouse button is within the shape (at least 5 pixels away from the perimeter.
	 * If so, the flag shapeSelected is set and the method returns true.
	 * Otherwise, the flag shapeSelected is reset and the method returns false.
	 */

	public boolean shapeIsSelected(Coordinates positionOfMouse){ 
		// Check if the user pressed the mouse button inside the shape
		int x, y;
		x = positionOfMouse.getX();
		y = positionOfMouse.getY();
		if ((x >= referencePoint.getX() + 5) &&
				(x <= referencePoint.getX() + width - 5) &&
				(y >= referencePoint.getY() + 5) &&
				(y <= referencePoint.getY() + height - 5)) {
			shapeSelected = true;
			lastMousePosition = positionOfMouse;
			return true;
		}else {
			shapeSelected = false;
			return false;
		}
	} 
	
	/*
	 * calculateArea() returns the area of the rectangle
	 */

	double calculateArea(){ 
		return (width * height);
	}
	
	/*
	 * showMe(g) displays the rectangle using the Graphic object g.
	 * It sets the color to be used, and draws the rectangle using the specified 
	 * reference point, the width and the height.
	 */

	public void showMe(Graphics g){
		g.setColor(colour);
		g.drawRect(referencePoint.getX(), // Draw a rectangle with the specified 
				// corner point
				referencePoint.getY(),  // width and height
				width,
				height);
	}
	
	/* 
	 * toString() returns the description of the rectangle - the color, 
	 * the reference point and the size.
	 */

	public String toString(){
		return ("Rectangle with reference point " + referencePoint + " having width "
				+ width + " and height " + height + "\n");
	}


}


