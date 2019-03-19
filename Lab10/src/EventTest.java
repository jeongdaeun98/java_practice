
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class EventTest extends JFrame {
	public static int count = 0;
	public EventTest() {
		setTitle("이벤트 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b = new JButton("Click");
		JLabel l = new JLabel(Integer.toString(count));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JButton jb = (JButton)e.getSource();
				if(jb.getActionCommand() == "Click")
					count++;
					l.setText(Integer.toString(count));
				}	
		});
		c.add(b);
		c.add(l);
		setSize(300,300);
		setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventTest();
	}

}