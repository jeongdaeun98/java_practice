import java.util.*;
import java.io.*;
public class FileAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		FileReader f = null;
		FileWriter fout = null;
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
			String str = scan.nextLine();
			fin = new FileReader(str);
			System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
			str = scan.nextLine();
			f = new FileReader(str);
			System.out.print("��ġ�� ���� �̸��� �Է��ϼ���>>");
			str = scan.nextLine();
			File file = new File(str);
			fout = new FileWriter(file);
			Scanner s = new Scanner(fin);
			Scanner c = new Scanner(f);
			while(s.hasNext()) {
				fout.write(s.nextLine()+ "\r\n");
			}
			while(c.hasNext()) {
				fout.write(c.nextLine() + "\r\n");
			}
			scan.close();
			s.close();
			c.close();
			fout.close();
			System.out.println("������Ʈ ���� �ؿ� " + file.getPath() + "���Ͽ� �����Ͽ����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("����� ����");
			e.printStackTrace();
		}
	}

}
