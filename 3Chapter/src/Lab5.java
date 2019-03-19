import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("금액을 입력하시오>>");
		Scanner s = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int [] won = new int [8];
		String one[] = {"50000원 짜리","10000원 짜리","1000원 짜리","500원 짜리","100원 짜리","50원 짜리","10원 짜리","1원 짜리"};
		int num = s.nextInt();
		s.close();
		int i;
		for( i = 0 ; i < unit.length; i++) {
			won[i] = num / unit[i];
			num = num - won[i] * unit[i];
			if(won[i] != 0)
				System.out.println(one[i] + " : " + won[i] + "개");
		}		

	}

}
