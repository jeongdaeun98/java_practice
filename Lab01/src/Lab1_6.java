import java.util.Scanner;

public class Lab1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int number = scanner.nextInt();
		scanner.close();
		
		int a, b;
		
		a = number % 10;
		b = number / 10;
		
		if((a == 3 || a == 6 || a == 9)  && (b == 3
				|| b == 6 || b == 9))
			System.out.println("박수짝짝");
		
		else if(a == 3 || a == 6 || a == 9 || b == 3
				|| b == 6 || b == 9)
			System.out.println("박수짝");
		
		else
			System.out.println("박수없음");
	}

}
