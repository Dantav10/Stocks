package stock;

import javax.swing.JButton;


public class StockButton extends JButton {
	
	private String name;
	private int money;
	private int x;
	private int y;
	
	public StockButton(String name, int money, int x, int y) {
		this.name = name;
		this.money = money;
		this.x = x;
		this.y = y;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
