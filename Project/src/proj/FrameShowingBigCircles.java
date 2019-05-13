package proj;
	import java.awt.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;
	public class FrameShowingBigCircles extends JFrame implements Observer{
		boolean shapesToDisplay;
		int numShapes;
		AbstractList.AbstractIterator myIterator;
		
		public  void showCircles(AbstractList listOfCircles, int numShapes){
			myIterator = listOfCircles.createIterator(Shape.maxNumberOfShapes);
			this.numShapes = numShapes;
			shapesToDisplay = true;
			repaint();
		}
		public void paint(Graphics g){
			super.paint(g);
			System.out.println("N = " + numShapes);

			if(shapesToDisplay){
				myIterator.first();
			
				while(!myIterator.isDone()){
					if (myIterator.currentItem().calculateArea() >= 5000.00){
						myIterator.currentItem().showMe(g);
						numShapes++;
					}			
					
					myIterator.next();
				}
			}

		}
		
		public FrameShowingBigCircles(){
			     super("Big Circles");
			     setSize(TesterFrame.WIDTH, TesterFrame.HEIGHT); 
			     setVisible(true); 
			     shapesToDisplay = false;
			     numShapes = 0;
			   }
		
		public void update(Observable o, Object arg) {
			
			numShapes = 0;
			
			if (arg instanceof AbstractList){
				AbstractList.AbstractIterator myIterator2 = ((AbstractList) arg).createIterator(Shape.maxNumberOfShapes);
				
				AbstractList listOfCircles = ShapeListFactory.getList(Shape.maxNumberOfShapes);
				
								
				myIterator2.first();
				while(!myIterator2.isDone()){
					if(myIterator2.currentItem() instanceof Circle){
						listOfCircles.append(myIterator2.currentItem());
						numShapes++;
					}
					myIterator2.next();
					
				}
				
				showCircles(listOfCircles, numShapes);
			}
		}

	}
