import java.awt.*;
import javax.swing.*;

public class GuiTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GuiTest() {
		setTitle("GUI TEST");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,2,-200,10));
		p1.add(new JLabel("�̸�"));
		p1.add(new JTextField(""));
		p1.add(new JLabel("�й�"));
		p1.add(new JTextField(""));
		p1.add(new JLabel("����"));
		JTextField text = new JTextField();
		text.setText("��ǻ�Ͱ��� ����");
		text.setEnabled(false);
		p1.add(text);
		p1.add(new JLabel("����ó"));
		p1.add(new JTextField(""));
		c.add(p1,BorderLayout.CENTER);
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.CENTER,5,30)); 
		p3.add(new JButton("Ȯ��"));
		p3.add(new JButton("���"));
		c.add(p3,BorderLayout.SOUTH);
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiTest();
		

	}

}
