import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class FontTest extends JFrame implements ActionListener{
	JRadioButton font[] = new JRadioButton[3];
	String fontString[] = {"����","����","�ü�"};
	JCheckBox style[] = new JCheckBox[2];
	String t = fontString[0];
	String styleString[] = {"BOLD","ITALIC"};
	JComboBox <Integer> comboSize;
	JTextField text;
	JLabel result;
	JPanel p1,p2,p3;
	public FontTest(){
		setTitle("Font ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		JPanel setP = new JPanel();
		setP.setLayout(new GridLayout(0,1,5,5));
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p3.setBorder(BorderFactory.createTitledBorder("Font���� ���"));
		//���� ��ư _ =��Ʈ ���� p1
		ButtonGroup bg = new ButtonGroup();
		for(int i = 0; i < 3; i++) {
			font[i] = new JRadioButton(fontString[i]);
			font[i].addActionListener(this);
			bg.add(font[i]);
			p1.add(font[i]);
		}
		//üũ�ڽ�_ ��Ÿ�� ����  p2
		for(int i = 0; i < 2; i++) {
			style[i] = new JCheckBox(styleString[i]);
			style[i].addActionListener(this);
			p1.add(style[i]);
		}
		//�޺��ڽ�
		comboSize = new JComboBox<Integer>();
		for(int i = 15; i < 35; i++) 
			comboSize.addItem(i);
		comboSize.addActionListener(this);
		//�ؽ�Ʈ �Է�
		text = new JTextField("Hello Java");
		text.addActionListener(this);
		//���
		result = new JLabel(text.getText());
		p3.add(result);
		
		//setP.add(�޺��ڽ�); setP.add(�ؽ�Ʈ�ڽ�);
		
		setP.add(p1); setP.add(p2);
		setP.add(comboSize); setP.add(text);
		c.add(setP, BorderLayout.CENTER);
		c.add(p3, BorderLayout.SOUTH);
		
		setSize(300,350);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		//result.setFont(new Font("�۲�","��Ÿ��",ũ��));
		
		int s,size;
		for(int i = 0; i < 3; i++) {
			if(e.getSource() == font[i])
				t = fontString[i];
		}
		
		s = Font.PLAIN; //Font.BOLD, Font.ITALIC ���� �̸鼭 ��Ż���̰� ������ +�� ���ش�.
		if(style[0].isSelected())
			s = Font.BOLD;
		if(style[1].isSelected())
			s += Font.ITALIC; // PLAIN �� ���� 0�̹Ƿ� =���� ���ص� ��� ����
		
		size = Integer.parseInt(comboSize.getSelectedItem().toString());
				
		result.setFont(new Font(t,s,size));
		
		result.setText(text.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FontTest();
	}

}
