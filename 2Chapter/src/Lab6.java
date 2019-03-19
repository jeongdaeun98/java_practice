import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = s.nextInt();
		int a, b;
		a = num / 10;
		b = num % 10;
		s.close();
		
		if(a == 3 || a == 6 || a == 9) {
			if(b == 3 || b == 6 || b == 9 )
				System.out.print("박수 짝짝");
			else
				System.out.print("박수 짝");
		}

	}

}
