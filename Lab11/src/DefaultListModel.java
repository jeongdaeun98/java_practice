import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DefaultListModel extends JFrame {

	Container c;
	private Vector <String> v = new Vector<String>();
	private JList<String> jl = new JList<String>(v);
	public DefaultListModel() {
		setTitle("리스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		JTextField jtf = new JTextField(20);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JTextField jtfName = new JTextField(20);
		JButton ok = new JButton("수정");
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				v.add(jtfName.getText());
				jl.setListData(v);
			}
		});
		JButton cancel = new JButton("취소");
		panel.add(jtfName);
		panel.add(ok);
		panel.add(cancel);
		c.add(panel, BorderLayout.SOUTH);
		c.add(jtf,BorderLayout.NORTH);
		c.add(new JScrollPane(jl),BorderLayout.CENTER);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DefaultListModel();
		
	}

}
