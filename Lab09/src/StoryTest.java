import java.awt.*;
import javax.swing.*;

public class StoryTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public StoryTest(){
		setTitle("SM Story");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel sm = new JLabel("SM Story");
		sm.setLocation(50,30);
		sm.setSize(500,20);
		c.add(sm);
		JLabel autumn = new JLabel("가을은");
		autumn.setLocation(90, 70);
		autumn.setSize(50,20);
		c.add(autumn);
		JTextField text = new JTextField("");
		text.setLocation(130, 110);
		text.setSize(100,30);
		c.add(text);
		JLabel is = new JLabel("이다");
		is.setLocation(250,150);
		is.setSize(50,20);
		c.add(is);
		setSize(400,300);	
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StoryTest();
		
	}

}
