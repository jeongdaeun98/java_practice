import java.awt.*;
import javax.swing.*;

public class GridTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GridTest() {
		setTitle("Grid TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(5,4,5,5));
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		p1.add(new JLabel("�л� ���� �Է�"));
		p2.add(new JLabel("�̸�"));
		p2.add(new JLabel("�й�"));
		p2.add(new JLabel("�а�"));
		p2.add(new JLabel("����ó"));
		for(int i = 0; i < 16; i++)
			p2.add(new JTextField(""));
		p3.add(new JButton("�߰�"));
		p3.add(new JButton("���"));
		c.add(p3,BorderLayout.SOUTH);
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.CENTER);
		setSize(500,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridTest();
	}

}
