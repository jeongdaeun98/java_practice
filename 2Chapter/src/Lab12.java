import java.util.Scanner;
public class Lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("연산>>");
		double a = s.nextDouble();
		String str = s.next();
		double b = s.nextDouble();
		double sum;
		s.close();
		if(str.equals("+")) {
			sum = a + b;
			System.out.println(a + str + b + "의 계산 결과는 " + sum);
		}
		else if(str.equals("-")) {
				sum = a - b;
			System.out.println(a + str + b + "의 계산 결과는 " + sum);
		}
		else if(str.equals("*")) 
			System.out.println(a + str + b + "의 계산 결과는 " + a*b);
		else {
			if(b == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
			System.out.println(a + str + b + "의 계산 결과는 " + a/b);
		}

	}

}
