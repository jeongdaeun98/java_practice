import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num[] = new int[3];
		int i;
		System.out.print("정수 3개를 입력하시오>>");
		for(i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		s.close();
		if(num[0] < num[1] + num[2] && num[1] < num[0] + num[2] && num[2] < num[0] + num[1])
			System.out.println("삼각형이 됩니다");
		else
			System.out.println("삼각형이 안됩니다");

	}

}
