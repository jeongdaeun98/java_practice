import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MoveStringFrame extends JFrame {

	public MoveStringFrame() {
		setTitle("Left 키로 문자열 회전");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JLabel l = new JLabel("Love Java");
		l.setBounds(80,10,150,20);
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					String s = l.getText();
					String a = s.substring(1);
					String b = s.substring(0,1);
					l.setText(a+b);
				}
			}
		});
		c.add(l);
		setSize(300,200);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoveStringFrame();
	}

}
