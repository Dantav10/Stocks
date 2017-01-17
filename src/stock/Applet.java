package stock;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Applet {
	
	private static final Random RANDOM = new Random();
	
	private static String hello = "big BONES";
	
	public static void main(String[] args){

	}
	
	public enum Loading {

		ONDEMAND_PREPARED(false);

		private boolean toggled;

		Loading(boolean toggled) {
		this.toggled = toggled;
		}

		public boolean getToggled() {
		return toggled;
		}

		public void setToggled(boolean toggled) {
		 this.toggled = toggled;
		}
	}
	
	
}