import java.util.*;
import java.io.*;
public class FileAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		FileReader f = null;
		FileWriter fout = null;
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("첫번째 파일 이름을 입력하세요>>");
			String str = scan.nextLine();
			fin = new FileReader(str);
			System.out.print("두번째 파일 이름을 입력하세요>>");
			str = scan.nextLine();
			f = new FileReader(str);
			System.out.print("합치는 파일 이름을 입력하세요>>");
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
			System.out.println("프로젝트 폴더 밑에 " + file.getPath() + "파일에 저장하였습니다.");
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
			e.printStackTrace();
		}
	}

}
