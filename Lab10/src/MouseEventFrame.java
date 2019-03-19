import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseEventFrame extends JFrame {

	public MouseEventFrame() {
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel l = new JLabel();
		l.setBounds(80,10,150,20);
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				l.setText("Love Java");
			}
			public void mouseExited(MouseEvent e) {
				l.setText("�����");
			}
		});
		c.add(l);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventFrame();
	}

}
