import java.awt.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class PlotPanel extends JPanel implements Observer {
	Drawable plot;
	Evaluator evaluator;
	public PlotPanel(Drawable plot, Color c) {
		this.setBackground(c);
		this.plot = plot;
		
	}
	@Override
	public void update(Observable source, Object observer) {
		int newValue = ((Source)source).getValue();
		plot.setValue(newValue);
		evaluator = evaluator.getInstance();
		evaluator.setValue(newValue);
		this.paintComponent(getGraphics());
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		plot.draw(g);
		

	}


}
