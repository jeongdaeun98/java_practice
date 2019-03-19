import java.util.Scanner;
public class GBBWithComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"가위", "바위", "보"};
		int n;

		Scanner s = new Scanner(System.in);
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			String game = s.next();
			n = (int)(Math.random()*3);
			if(game.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			else if(game.equals(str[n]))
				System.out.println("사용자 = " +game +", 컴퓨터 = "+str[n]+", 비겼습니다.");
			
			else if(game.equals(str[0])) {
				if(str[n].equals(str[1])) 
					System.out.println("사용자 = " +game +", 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
				
				else if(str[n].equals(str[2]))
					System.out.println("사용자 = " +game +", 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
				
			}
			else if(game.equals(str[1])) {
				if(str[n].equals(str[2]))
					System.out.println("사용자 = " +game +", 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
				else if(str[n].equals(str[0]))
					System.out.println("사용자 = " +game +", 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
			}
			else if(game.equals(str[2])) {
				if(str[n].equals(str[0]))
					System.out.println("사용자 = " +game +", 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
				else if(str[n].equals(str[1]))
					System.out.println("사용자 = " +game +", 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
			}
		}
		s.close();
	}

}
