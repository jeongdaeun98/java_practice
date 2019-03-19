import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class TenColorsButtonsFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TenColorsButtonsFrame() {
		Random random = new Random();
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		for(int i = 0; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setBackground(new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)));
			c.add(b);
		}
		
		setSize(600,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TenColorsButtonsFrame();
	}

}
