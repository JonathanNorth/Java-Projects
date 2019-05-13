package proj;

public class ShapeListFactory {

	public static AbstractList getList(int numberOfElements){
		return new ArrayOfShapesWithIterator(numberOfElements);
	}
}
