package stock;

import java.awt.Graphics;

import javax.swing.JPanel;


public class StockPanel extends JPanel implements Runnable {

	private volatile boolean isRunning = false;
	
	private static Graphics graphics;
	
	public StockPanel sendStockPanel() {
		this.setSize(400, 400);
		this.setLayout(null);
		this.setVisible(true);
		new Thread(this).start();
		new StockButtonHandler().addButtons(this);
		return this;
	}
	
	public StockPanel() {
		isRunning = true;
	}
	
	   @Override 
	   public void paintComponent(Graphics g) {
	      
	    }
	
	@Override
	public void run() {
		while(isRunning) { 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	public static Graphics getGraphic() {
		return graphics;
	}


}
