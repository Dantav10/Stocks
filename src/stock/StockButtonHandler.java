package stock;

import java.awt.Graphics;

import javax.swing.JButton;

import stock.impl.Microsoft;


public final class StockButtonHandler {
	
	private JButton[] stockButton = new JButton[2];
	
	private StockType[] stockType = {
									new Microsoft()
									};
	
	public StockButtonHandler() {
		stockButton[0] = new StockButton("Microsoft", 10, 0, 0);
		stockButton[1] = new StockButton("Apple", 10, 200, 0);
	}
	
	public StockButtonHandler addButtons(StockPanel stockPanel) {
		for(int i = 0; i < stockButton.length; i++) {
			stockButton[i].setLocation(stockButton[i].getX(), stockButton[i].getY());
			stockButton[i].setText(stockButton[i].getName());
			stockButton[i].setSize(200, 100);
			stockButton[i].setVisible(true);
			stockPanel.add(stockButton[i]);
			Applet.getJFrame().add(stockPanel);
		}
		return this;
	}
	
	
	

}
