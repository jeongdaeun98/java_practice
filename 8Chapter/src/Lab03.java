import java.io.*;
public class Lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\windows\\system.ini");
			int i;
			char c;
			while((i = fin.read()) != -1) {
				c = Character.toUpperCase((char)i);
				System.out.print(c);
			}
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}

	}

}
