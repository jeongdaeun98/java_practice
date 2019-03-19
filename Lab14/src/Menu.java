import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

	Container c;
	public Menu(){
		setTitle("메뉴 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("파일");
		JMenu edit = new JMenu("편집");
		JMenu doum = new JMenu("도움말");
		JMenuItem open = new JMenuItem
		JLabel text = new JLabel("text");
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
