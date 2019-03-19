import java.util.Scanner;
import java.io.*;
public class PhoneSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fout = null;
		Scanner s = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");
		File f = new File("c:\\temp\\phone.txt");
		try {
			fout = new FileWriter(f);
			while(true) {
				System.out.print("이름 전화번호 >>");
				String name = s.nextLine();
				if(name.equals("그만")) break;
				fout.write(name + "\r\n");
			}
			System.out.println(f.getPath()+"에 저장하였습니다.");
			fout.close();
		}
			catch(IOException e){
				System.out.println("입출력 오류");
				e.printStackTrace();
			}
		s.close();
	}

}
