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
			System.out.println("C:\\windows\\system.ini 파일을 읽어 출력합니다.");
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
			System.out.println("입출력 오류");
			e.printStackTrace();
	}

	}
}
