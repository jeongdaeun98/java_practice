import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ClickPracticeFrame extends JFrame {
	public ClickPracticeFrame() {
		setTitle("클릭 연습 용 응용 프로그램");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		System.out.print(c.getX());
		
		JLabel l = new JLabel("C");
		l.setBounds(100,100,50,50);
		l.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int sx = (int)((Math.random()*250) + 1);
				int sy = (int)((Math.random()*200) + 1);
				l.setLocation(sx,sy);
			}
		});
		c.add(l);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClickPracticeFrame();
	}

}
