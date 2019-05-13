package proj;

public class ArrayOfShapesWithIterator extends AbstractList{
	
	private Shape shapes[];
	private int numElements = 0;
	
	public ArrayOfShapesWithIterator(int numCells){
		shapes = new Shape[numCells];
	}
	
	public AbstractIterator createIterator(int numElements) {
		return new Iterator(numElements);
	}

	
	public void append(Shape v) {
		shapes[numElements] = v;
		numElements++;
		
	}
	
	public class Iterator extends AbstractIterator implements MyIterator{
		
		private Shape result[];
		private int currentElement;
		private int numElements;
		private boolean endOfTable;
		
		public Iterator(int numberOfElementsInTheTable){
			result = new Shape[numberOfElementsInTheTable];
			numElements = 0;
			
			for(int i=0; i < numberOfElementsInTheTable; i++){
				insert(shapes[i], result);
			}
			
		}
		
		public void insert(Shape newElement, Shape[] result){
			result[numElements] = newElement;
			numElements++;
		}
		
		public void first() {
			currentElement = 0;
			if (numElements > 0) endOfTable = false;
			else endOfTable = true;
			
		}

		public void next() {
			if (currentElement < numElements - 1)
				currentElement++;
			else endOfTable = true;
		}

		
		public boolean isDone() {
			if(result[currentElement] == null){
				endOfTable = true;
			}
			return endOfTable;
		}

		
		public Shape currentItem() {
			return result[currentElement];
		}
		
	}

}
