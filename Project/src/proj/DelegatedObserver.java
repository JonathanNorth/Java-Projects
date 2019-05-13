package proj;

import java.util.Observable;

public class DelegatedObserver extends Observable {
	
	public void clearChanged(){
		super.clearChanged();
	}
	public void setChanged(){
		super.setChanged();
	}
}
