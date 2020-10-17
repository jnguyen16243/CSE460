import java.util.Observable;

public class Source extends Observable {
	private int value;
	public void work() {
		setChanged();
		value = (int) (Math.random() *200) +1;
		notifyObservers();
	}
	public int getValue() {
		return value;
	}
}
