import java.awt.Color;
import java.awt.Graphics;

public class SimplePlot extends Drawable {
	Evaluator evaluator;
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
			int x = 5;
			for(int i = 0; i < data.size()-1;i++) {
				g.drawLine(x, data.get(i), x + 30 , data.get(i+1) );
				x +=30;
			}
			evaluator = evaluator.getInstance();
			evaluator.draw(g);
	}
}
