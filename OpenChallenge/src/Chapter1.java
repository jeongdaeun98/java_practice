import java.util.Scanner;
public class Chapter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String chulsu = s.next();
		System.out.print("영희 >> ");
		String younghee = s.next();
		s.close();
		
		if(chulsu.equals(younghee)) 
			System.out.println("비겼습니다.");
		else if(chulsu.equals("가위")) {
			if(younghee.equals("바위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}
		else if(chulsu.equals("바위")) {
			if(younghee.equals("보"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}
		else {
			if(younghee.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}

	}

}
