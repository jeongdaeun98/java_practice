import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

	Container c;
	public Menu(){
		setTitle("�޴� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("����");
		JMenu edit = new JMenu("����");
		JMenu doum = new JMenu("����");
		JMenuItem open = new JMenuItem
		JLabel text = new JLabel("text");
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
