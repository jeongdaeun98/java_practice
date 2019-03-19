import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GraphicsTest extends JFrame {

	public GraphicsTest() {
		setTitle("그리기 실습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(500,300);
		setVisible(true);
		
	}
	class MyPanel extends JPanel{
		public MyPanel() {
			//버튼이나 라벨, 텍스트필드를 부착하고 싶다면,
			add(new Label("라벨 만들기"));
			add(new JButton("버튼 만들기"));
			
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(30,50,100,100);
			g.setColor(Color.RED);
			g.setFont(new Font("Arial",Font.BOLD, 30));//새롭게 그려지기 위해서는 컬러 폰트 먼저
			g.drawString("Computer Science",100,100);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GraphicsTest();
	}

}
