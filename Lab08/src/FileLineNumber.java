import java.io.*;
import java.util.Scanner;
public class FileLineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int i = 1;
		String c;
		try {
			fin = new FileReader("C:\\windows\\system.ini");
			Scanner s = new Scanner(fin);
			System.out.println("C:\\windows\\system.ini ������ �о� ����մϴ�.");
			while(s.hasNext()) {
				c = s.nextLine();
				System.out.printf("%4d",i);
				System.out.print(": ");
				System.out.println(c);
				i++;
					}
			fin.close();
			s.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
			e.printStackTrace();
	}

	}
}
