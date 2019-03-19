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
			System.out.println("총 " + count +"개의 전화번호를 읽었습니다.");
			while(true) {
				System.out.print("이름>>");
				String name = scan.next();
				if(name.equals("그만"))break;
				if(h.containsKey(name)) {
					p = h.get(name);
					System.out.println(p);
				}
				else
					System.out.println("찾는 이름이 없습니다.");
			}
			sc.close();
			scan.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
