import java.util.*;
import java.io.*;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> h = new HashMap<String,String>();
		try {
			FileReader fin = new FileReader("c:\\temp\\phone.txt");
			Scanner sc = new Scanner(fin);
			Scanner scan = new Scanner(System.in);
			int count = 0;
			String p;
			while(sc.hasNext()) {
				h.put(sc.next(), sc.next());
				count++;
			}
			System.out.println("�� " + count +"���� ��ȭ��ȣ�� �о����ϴ�.");
			while(true) {
				System.out.print("�̸�>>");
				String name = scan.next();
				if(name.equals("�׸�"))break;
				if(h.containsKey(name)) {
					p = h.get(name);
					System.out.println(p);
				}
				else
					System.out.println("ã�� �̸��� �����ϴ�.");
			}
			sc.close();
			scan.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}

	}

}
