import java.util.Scanner;
import java.io.*;
public class PhoneSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fout = null;
		Scanner s = new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
		File f = new File("c:\\temp\\phone.txt");
		try {
			fout = new FileWriter(f);
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >>");
				String name = s.nextLine();
				if(name.equals("�׸�")) break;
				fout.write(name + "\r\n");
			}
			System.out.println(f.getPath()+"�� �����Ͽ����ϴ�.");
			fout.close();
		}
			catch(IOException e){
				System.out.println("����� ����");
				e.printStackTrace();
			}
		s.close();
	}

}
