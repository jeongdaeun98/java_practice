import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class RandomLabels extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public RandomLabels() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Random random = new Random();
		Container c = getContentPane();
		c.setLayout(null);
		for(int i = 0; i < 20; i++) {
			JLabel label = new JLabel();
			int x = random.nextInt(201) + 50;
			int y = random.nextInt(201) + 50;
			label.setLocation(x,y);
			label.setBackground(Color.BLUE);
			label.setSize(10,10);
			label.setOpaque(true);
			c.add(label);
		}
			setSize(300,300);
			setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomLabels();
		
	}

}
