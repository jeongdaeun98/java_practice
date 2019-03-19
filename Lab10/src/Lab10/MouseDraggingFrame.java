
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MouseDraggingFrame extends JFrame {

	public MouseDraggingFrame() {
		setTitle("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		c.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
		});
		c.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseDraggingFrame();
	}

}