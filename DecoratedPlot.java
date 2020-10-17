import java.awt.Graphics;

public class DecoratedPlot extends Drawable {
	protected Drawable plot;
	public void add(Drawable plot) {
		this.plot = plot;
	}
	@Override
	public void draw(Graphics g) {
		this.plot.draw(g);
	}
}
