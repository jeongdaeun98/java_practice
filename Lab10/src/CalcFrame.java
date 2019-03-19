import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcFrame extends JFrame {
	int n1,n2,s;
	public CalcFrame() {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		JButton b = new JButton("=");
		b.setBounds(220, 30, 50, 30);
		JTextField num1 = new JTextField(10);
		JTextField num2 = new JTextField(10);
		JTextField sum = new JTextField(100);
		num1.setBounds(50,30,50,30);
		num2.setBounds(140,30,50,30);
		sum.setBounds(300,30,100,30);
		JLabel l = new JLabel("X");
		l.setBounds(120,30,80,30);
		c.add(num1);
		c.add(l);
		c.add(num2);
		c.add(b);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JButton jb = (JButton)e.getSource();
				if(jb == b) {
					s = Integer.parseInt(num1.getText()) *Integer.parseInt(num2.getText());
					sum.setText(Integer.toString(s));
				}
			}
		});
		c.add(sum);
		setSize(600,200);
		setVisible(true);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalcFrame();
	}

}
