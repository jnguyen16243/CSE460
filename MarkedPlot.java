import java.awt.Color;
import java.awt.Graphics;

public class MarkedPlot extends DecoratedPlot{
	@Override
	public void draw(Graphics g) {
		
		super.draw(g);
		g.setColor(Color.BLUE);
		int x = 5;
			for(int i = 0; i < data.size()-1;i++) {
				g.fillRect(x,data.get(i), 10,10);
				
				x +=30;
			}
	
	}
}
