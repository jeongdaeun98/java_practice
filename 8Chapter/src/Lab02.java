import java.io.*;
public class Lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\temp\\phone.txt");
			System.out.println("C:\\\\temp\\\\phone.txt�� ����մϴ�.");
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("����� ����");
		}

	}

}
