import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit[] = new int[8];
		int m[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = s.nextInt();
		s.close();
		
		for(int i = 0; i < 8; i++) {
		unit[i] = money / m[i];
		money -= unit[i]*m[i];
		
		if(unit[i] != 0)
		System.out.println(m[i]+"원 짜리" + unit[i] + "개");
		}
		
	}

}
