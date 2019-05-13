package proj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.event.*;

/*Class to create GUI*/
public class OutputFrame extends JFrame implements Observer{
	final int WIDTH = 450, HEIGHT = 300;
	private JTextArea outputArea;
	private String displayResultString;
	
	public OutputFrame(){
		super("Rectangles and Squares");
		outputArea = new JTextArea(20, 30);
		add(outputArea);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
	}
	public void displayResult(String s){
		//			System.out.println(s);
		outputArea.setText(s);
	}
	
	public void update(Observable o, Object arg) {
		
		displayResultString = "";

		if(arg instanceof AbstractList){
			
			AbstractList listOfShapes = (AbstractList)arg;
			AbstractList.AbstractIterator myIterator = listOfShapes.createIterator(Shape.maxNumberOfShapes);
			
			myIterator.first();
			while(!myIterator.isDone()){
				if(myIterator.currentItem() instanceof Rectangle || myIterator.currentItem() instanceof Square){
					displayResultString += myIterator.currentItem().toString() + "\n";
				}
				myIterator.next();
			}
			
			displayResult(displayResultString);
					
		}
	
	}
}


