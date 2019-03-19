import java.io.*;
public class Lab04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		FileReader f = null;
		int i = 1, count = 0, j = 0;
		int c;
		try {
			fin = new FileReader("C:\\windows\\system.ini");
			f = new FileReader("C:\\windows\\system.ini");
			System.out.println("C:\\windows\\system.ini 파일을 읽어 출력합니다.");
			while((c = f.read()) != -1)
				++count;
			while((c = fin.read()) != -1) {
				++j;
				if(j < count) {
					if(i == 1) {
						System.out.print(" "+ i + ": ");
						System.out.print((char)c);
						i++;
					}
					else if(i < 10 && c == 10) {
						System.out.print((char)c);
						System.out.print(" "+ i + ": ");
						i++;
						
					}
					else if(c == 10) {
						System.out.print((char)c);
						System.out.print(i + ": ");
						i++;
					}
					else
						System.out.print((char)c);
				}
			}
				
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
	}

}
