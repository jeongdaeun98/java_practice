import javax.swing.*;
import java.awt.*;

public class BorderLayoutPractice extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BorderLayoutPractice() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7));
		c.add(new JButton("Center"),BorderLayout.CENTER);
		c.add(new JButton("North"),BorderLayout.NORTH);
		c.add(new JButton("South"),BorderLayout.SOUTH);
		c.add(new JButton("East"),BorderLayout.EAST);
		c.add(new JButton("West"),BorderLayout.WEST);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new BorderLayoutPractice();

	}

}
