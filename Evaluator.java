import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
public class Evaluator extends Drawable{
	private static Evaluator instance;
	protected Evaluator() {}
		public static Evaluator getInstance() {
			if(instance == null) {
				instance = new Evaluator();
			}
			return instance;
		}
	public int average() {
		int sum = 0;
		int average = 0;
		for(int i = 0; i < data.size(); i++) {
			sum += data.get(i);
		}
		if(data.size() != 0) {
			average = sum /data.size();
		}
		return average;
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		int average = this.average();
		g.drawLine(0,average , 1000, average);
	}


}
