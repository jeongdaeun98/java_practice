import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ColorFontTest extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public ColorFontTest() {
		setTitle("Color, Font��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(800,300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			Font f = new Font("�ü�",Font.PLAIN,40);
			Font o = new Font("�������üB",Font.ITALIC,40);
			Font n = new Font("�޸ո���ü",Font.ITALIC,60);
			Font t = new Font("HY����B",Font.PLAIN,20);
			g.setFont(f);
			g.drawString("���� : ���ѹα� ("+f.getName()+" ��Ʈ)",20,40);
			g.setColor(Color.RED);
			g.setFont(o);
			g.drawString("�ּ� : ����� ���ϱ�("+o.getName()+" ��Ʈ)",20,90);
			g.setColor(Color.YELLOW);
			g.setFont(n);
			g.drawString("���� : ������("+n.getName()+" ��Ʈ)",20,160);
			g.setColor(Color.BLACK);
			g.setFont(t);
			g.drawString("�й� : 1615409("+t.getName()+" ��Ʈ)",20,200);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorFontTest();
	}

}
