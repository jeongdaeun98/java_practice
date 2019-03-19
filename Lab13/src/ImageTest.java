import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ImageTest extends JFrame {
	private Panel panel = new Panel();
	public ImageTest() {
		setTitle("그래픽 이미지 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300,300);
		setVisible(true);
}
	class Panel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int width = getWidth()/2;
			int height = getHeight()/2;
			g.drawImage(img,0,0,width-10,height-10,0,0,img.getWidth(this)/2,img.getHeight(this)/2,this);
			g.drawImage(img,width+10,0,width*2,height-10,img.getWidth(this)/2,0,img.getWidth(this),img.getHeight(this)/2,this);
			g.drawImage(img,0,height+10,width-10,height*2,0,img.getHeight(this)/2,img.getWidth(this)/2,img.getHeight(this),this);
			g.drawImage(img,width+10,height+10,width*2,height*2,img.getWidth(this)/2,img.getHeight(this)/2,img.getWidth(this),img.getHeight(this),this);
			
		}
	}


	
	public static void main(String [] args) {
		new ImageTest();
	}
}
