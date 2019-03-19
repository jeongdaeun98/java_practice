import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouse extends JFrame  {
	
	public Mouse() {
	setTitle("¸¶¿ì½º");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(null);
	class MyMouseListener extends MouseAdapter{
		private int count = 0;
		public void mouseReleased(MouseEvent e) {
			System.out.print(count);
		}
		public void mousePressed(MouseEvent e) {
			count++;
		}
		public void mouseDragged(MouseEvent e) {
			count++;
		}
	}
	MyMouseListener ml = new MyMouseListener();
	c.addMouseListener(new MyMouseListener());
	c.addMouseMotionListener(new MyMouseListener());
	setSize(300,300);
	setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mouse();
	}

}
