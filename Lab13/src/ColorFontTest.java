import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ColorFontTest extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public ColorFontTest() {
		setTitle("Color, Font사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(800,300);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			Font f = new Font("궁서",Font.PLAIN,40);
			Font o = new Font("양재깨비체B",Font.ITALIC,40);
			Font n = new Font("휴먼매직체",Font.ITALIC,60);
			Font t = new Font("HY나무B",Font.PLAIN,20);
			g.setFont(f);
			g.drawString("국적 : 대한민국 ("+f.getName()+" 폰트)",20,40);
			g.setColor(Color.RED);
			g.setFont(o);
			g.drawString("주소 : 서울시 강북구("+o.getName()+" 폰트)",20,90);
			g.setColor(Color.YELLOW);
			g.setFont(n);
			g.drawString("성명 : 정다은("+n.getName()+" 폰트)",20,160);
			g.setColor(Color.BLACK);
			g.setFont(t);
			g.drawString("학번 : 1615409("+t.getName()+" 폰트)",20,200);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorFontTest();
	}

}
