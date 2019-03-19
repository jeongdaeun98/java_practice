import javax.swing.*;
import java.awt.*;

public class TenButtonsFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TenButtonsFrame(){
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(1,10);
		
		Container c = getContentPane();
		c.setLayout(grid);
		for(int i = 0; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			c.add(b);
		}	
		setSize(600,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TenButtonsFrame();

	}

}
