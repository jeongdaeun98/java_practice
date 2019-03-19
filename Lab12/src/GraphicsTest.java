import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GraphicsTest extends JFrame {

	public GraphicsTest() {
		setTitle("�׸��� �ǽ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(500,300);
		setVisible(true);
		
	}
	class MyPanel extends JPanel{
		public MyPanel() {
			//��ư�̳� ��, �ؽ�Ʈ�ʵ带 �����ϰ� �ʹٸ�,
			add(new Label("�� �����"));
			add(new JButton("��ư �����"));
			
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(30,50,100,100);
			g.setColor(Color.RED);
			g.setFont(new Font("Arial",Font.BOLD, 30));//���Ӱ� �׷����� ���ؼ��� �÷� ��Ʈ ����
			g.drawString("Computer Science",100,100);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GraphicsTest();
	}

}
