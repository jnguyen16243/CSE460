import java.awt.Graphics;
import java.util.Vector;

public class Drawable {
	protected Vector<Integer>  data= new Vector<Integer>(20);
	public void draw(Graphics g) {
		
	}
	public void setValue(int newValue) {
		if(data.size() == 20) {
			data.remove(0);
			data.addElement(newValue);
		}else {
			data.addElement(newValue);
		}
	
		return;
	}
	

}
