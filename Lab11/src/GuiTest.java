import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiTest extends JFrame implements ActionListener{
	JTextField tfName, tfNumber;
	JLabel lName, lNumber, lPhone;
	JButton btnOk, btnCancel;
	JPanel p1,p3;
	Container c;
	public GuiTest(){
		c = getContentPane();
		setTitle("GUI Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel(); p3 = new JPanel();
		p1.setLayout(new GridLayout(4,2,-200,10));
		lName = new JLabel("이름"); lNumber = new JLabel("학번");
		tfName = new JTextField(10); tfNumber = new JTextField(10);
		btnOk = new JButton("확인"); btnCancel = new JButton("취소");
		p1.add(lName); p1.add(tfName); p1.add(lNumber); p1.add(tfNumber);
		p1.add(new JLabel("연락처")); 
		JTextField text = new JTextField();
		text.setText("컴퓨터과학 전공");
		text.setEditable(false);
		p1.add(text);
		p3.setLayout(new FlowLayout(FlowLayout.CENTER,5,30)); 
		p3.add(btnOk); p3.add(btnCancel);
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		c.add(p3,BorderLayout.SOUTH); c.add(p1,BorderLayout.CENTER);
		
		setSize(400,300);
		setVisible(true);
	}
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
			if(o == btnOk) {
				System.out.print(tfName.getText()+ "\t");
				System.out.print(tfNumber.getText());
			}
			if(o == btnCancel) {
				tfName.setText("");
				tfNumber.setText("");
					
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuiTest();
	}

}
