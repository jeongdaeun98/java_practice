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
		p1.add(new JLabel("학생 정보 입력"));
		p2.add(new JLabel("이름"));
		p2.add(new JLabel("학번"));
		p2.add(new JLabel("학과"));
		p2.add(new JLabel("연락처"));
		for(int i = 0; i < 16; i++)
			p2.add(new JTextField(""));
		p3.add(new JButton("추가"));
		p3.add(new JButton("취소"));
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
