import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame implements ActionListener {
	private PlotPanel panels;
	private Source source;
	public Main() {
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS) );
		source = new Source();
		BarPlot barPlot = new BarPlot();
		MarkedPlot markedPlot = new MarkedPlot();
		SimplePlot simplePlot = new SimplePlot();
		barPlot.add(markedPlot);
		markedPlot.add(simplePlot);
		PlotPanel simplePanel = new PlotPanel(simplePlot, Color.LIGHT_GRAY);
		PlotPanel markedPanel = new PlotPanel(markedPlot, Color.GRAY);
		PlotPanel barPanel = new PlotPanel(barPlot, Color.black);
		JButton button = new JButton("Run");
		button.addActionListener(this);
		source.addObserver(simplePanel);
		source.addObserver(markedPanel);
		source.addObserver(barPanel);
		container.add(simplePanel);
		container.add(markedPanel);
		container.add(barPanel);
		container.add(button);
		this.add(container);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		source.work();
		
	}
	public static void main(String[] args) {
		
		Main win = new Main();
		win.setSize(1000,1000);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
