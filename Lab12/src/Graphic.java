import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Graphic extends JFrame{

	private Mypanel myPanel = new Mypanel();
	private Panel panel = new Panel();
	public Graphic() {
		setTitle("d");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,300);
		setVisible(true);
	}
	class Mypanel extends JPanel{
	public void paintComponent(Graphics g) {
		int x1 =this.getWidth()/2; int x3 = this.getWidth()/2;
		int x2 =this.getWidth(); int x4 = 0;
		int y1 = 0; int y2 = this.getHeight()/2;
		int y3 = this.getHeight(); int y4 = this.getHeight()/2;
		for(int i = 1; i <= 10; i++) {
		int [] x = {x1,x2-i*10,x3,x4+i*10};
		int [] y = {y1+i*10,y2,y3-i*10,y4};
		g.drawPolygon(x,y,4);
		}
		
		
	}
	}
	class Panel extends JPanel{
		public void paintComponent(Graphics g) {
			for(int i = 1; i <= 10; i++) {
				g.drawLine(i*this.getWidth()/10,0,i*this.getWidth()/10,this.getHeight());
			}
			for(int i = 1; i <= 10; i++) {
				g.drawLine(0,i*this.getHeight()/10,this.getWidth() ,i*this.getHeight()/10 );
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Graphic();
	}

}
