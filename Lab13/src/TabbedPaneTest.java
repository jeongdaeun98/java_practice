import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class TabbedPaneTest extends JFrame {
	public TabbedPaneTest() {
	setTitle("ÅÇÆÒ ¸¸µé±â ¿¹Á¦");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	JTabbedPane pane = createTabbedPane();
	c.add(pane, BorderLayout.CENTER);
	setSize(250,250);
	setVisible(true);
}
private JTabbedPane createTabbedPane() {
	JTabbedPane pane = new JTabbedPane();
	pane.addTab("Chart1", new Panel1());
	pane.addTab("Chart2", new Panel2());
	pane.addTab("Star", new Panel3());
	return pane;
}
class Panel1 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRoundRect(5, 10, 150, 150,40,60);
		g.setColor(Color.RED);
		g.fillRect(30,50,20,100);
		g.setColor(Color.BLUE);
		g.fillRect(60,90,20,60);
		g.setColor(Color.yellow);
		g.fillRect(90,120,20,30);
		g.setColor(Color.green);
		g.fillRect(120,90,20,60);
	}
}
class Panel2 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRoundRect(10, 10, 150, 150,40,60);
		g.setColor(Color.RED);
		g.fillArc(30, 30, 100, 100, 70, 130);
		g.setColor(Color.BLUE);
		g.fillArc(30, 30, 100, 100, 200, 15);
		g.setColor(Color.yellow);
		g.fillArc(30, 30, 100, 100,215 , 100);
		g.setColor(Color.green);
		g.fillArc(30, 30, 100, 100,315 , 120);
	}
}
class Panel3 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x [] = {75,90,105,135,110,115,90,65,75,45};
		int y [] = {60,30,60,60,75,105,90,105,75,60};
		g.drawRoundRect(15, 10, 150, 150,40,60);
		g.setColor(Color.magenta);
		g.fillPolygon(x,y,10);
	}
}
public static void main(String[] args) {
	// TODO Auto-generated method stub

	new TabbedPaneTest();
	
}

}
