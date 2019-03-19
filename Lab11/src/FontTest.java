import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class FontTest extends JFrame implements ActionListener{
	JRadioButton font[] = new JRadioButton[3];
	String fontString[] = {"굴림","돋움","궁서"};
	JCheckBox style[] = new JCheckBox[2];
	String t = fontString[0];
	String styleString[] = {"BOLD","ITALIC"};
	JComboBox <Integer> comboSize;
	JTextField text;
	JLabel result;
	JPanel p1,p2,p3;
	public FontTest(){
		setTitle("Font 설정");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		JPanel setP = new JPanel();
		setP.setLayout(new GridLayout(0,1,5,5));
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p3.setBorder(BorderFactory.createTitledBorder("Font설정 결과"));
		//라디오 버튼 _ =폰트 선택 p1
		ButtonGroup bg = new ButtonGroup();
		for(int i = 0; i < 3; i++) {
			font[i] = new JRadioButton(fontString[i]);
			font[i].addActionListener(this);
			bg.add(font[i]);
			p1.add(font[i]);
		}
		//체크박스_ 스타일 설정  p2
		for(int i = 0; i < 2; i++) {
			style[i] = new JCheckBox(styleString[i]);
			style[i].addActionListener(this);
			p1.add(style[i]);
		}
		//콤보박스
		comboSize = new JComboBox<Integer>();
		for(int i = 15; i < 35; i++) 
			comboSize.addItem(i);
		comboSize.addActionListener(this);
		//텍스트 입력
		text = new JTextField("Hello Java");
		text.addActionListener(this);
		//결과
		result = new JLabel(text.getText());
		p3.add(result);
		
		//setP.add(콤보박스); setP.add(텍스트박스);
		
		setP.add(p1); setP.add(p2);
		setP.add(comboSize); setP.add(text);
		c.add(setP, BorderLayout.CENTER);
		c.add(p3, BorderLayout.SOUTH);
		
		setSize(300,350);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		//result.setFont(new Font("글꼴","스타일",크기));
		
		int s,size;
		for(int i = 0; i < 3; i++) {
			if(e.getSource() == font[i])
				t = fontString[i];
		}
		
		s = Font.PLAIN; //Font.BOLD, Font.ITALIC 볼드 이면서 이탈릭이고 싶으면 +을 해준다.
		if(style[0].isSelected())
			s = Font.BOLD;
		if(style[1].isSelected())
			s += Font.ITALIC; // PLAIN 의 값은 0이므로 =으로 안해도 상관 없다
		
		size = Integer.parseInt(comboSize.getSelectedItem().toString());
				
		result.setFont(new Font(t,s,size));
		
		result.setText(text.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FontTest();
	}

}
