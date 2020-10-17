import java.awt.Color;
import java.awt.Graphics;

public class BarPlot extends DecoratedPlot{
	@Override
	public void draw(Graphics g) {
		int x = 5;
			for(int i = 0; i < data.size()-1;i++) {
				g.setColor(Color.CYAN);
				g.fillRect(x,data.get(i), 10,1000);
				
				x +=30;
			}
		super.draw(g);
	
	}
}
