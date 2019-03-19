import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ShowDialogue extends JFrame {
	JMenu fileMenu, editMenu, doMenu;
	JMenuItem open, storage, exit, colorSelect, font, textch, version;
	JLabel text;
	Container c;
	public ShowDialogue() {
		setTitle("Menu ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		createMenu();
		setSize(500,300);
		setVisible(true);
	}
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		fileMenu = new JMenu("����"); editMenu = new JMenu("����"); doMenu = new JMenu("����");
		text = new JLabel("text");
		text.setToolTipText("������ ���� ������ �����Դϴ�.");
		c.add(text,BorderLayout.NORTH);
		open = new JMenuItem("����");
		storage = new JMenuItem("����");
		exit = new JMenuItem("����");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rs = JOptionPane.showConfirmDialog(null,"�����Ͻðڽ��ϱ�?","����Ȯ��",JOptionPane.OK_CANCEL_OPTION);
				if(rs == JOptionPane.YES_OPTION)
					System.exit(0);
				else
					;
			}
		});
		colorSelect = new JMenuItem("�� ����");
		font = new JMenuItem("��Ʈ");
		textch = new JMenuItem("�ؽ�Ʈ ����");
		textch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text1 = JOptionPane.showInputDialog(null,"������ �ؽ�Ʈ�� �Է��ϼ���.");
				if(text1.length() != 0)
					text.setText(text1);
			}
		});
		version = new JMenuItem("���� ����");
		version.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"�׽�Ʈ v1.0","���� ����",JOptionPane.INFORMATION_MESSAGE);
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
