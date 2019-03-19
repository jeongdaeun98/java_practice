import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ShowDialogue extends JFrame {
	JMenu fileMenu, editMenu, doMenu;
	JMenuItem open, storage, exit, colorSelect, font, textch, version;
	JLabel text;
	Container c;
	public ShowDialogue() {
		setTitle("Menu 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		createMenu();
		setSize(500,300);
		setVisible(true);
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		fileMenu = new JMenu("파일"); editMenu = new JMenu("편집"); doMenu = new JMenu("도움말");
		text = new JLabel("text");
		text.setToolTipText("편집에 따라 변경할 영역입니다.");
		c.add(text,BorderLayout.NORTH);
		open = new JMenuItem("열기");
		storage = new JMenuItem("저장");
		exit = new JMenuItem("종료");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rs = JOptionPane.showConfirmDialog(null,"종료하시겠습니까?","종료확인",JOptionPane.OK_CANCEL_OPTION);
				if(rs == JOptionPane.YES_OPTION)
					System.exit(0);
				else
					;
			}
		});
		colorSelect = new JMenuItem("색 선택");
		font = new JMenuItem("폰트");
		textch = new JMenuItem("텍스트 변경");
		textch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text1 = JOptionPane.showInputDialog(null,"변경할 텍스트를 입력하세요.");
				if(text1.length() != 0)
					text.setText(text1);
			}
		});
		version = new JMenuItem("버전 정보");
		version.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"테스트 v1.0","버전 정보",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		fileMenu.add(open);
		fileMenu.add(storage);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		editMenu.add(colorSelect);
		editMenu.add(font);
		editMenu.add(textch);
		doMenu.add(version);
		mb.add(fileMenu);
		mb.add(editMenu);
		mb.add(doMenu);
		setJMenuBar(mb);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ShowDialogue();
	}

}
