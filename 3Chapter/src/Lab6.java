import java.util.Scanner;
public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오>>");
		int num [] = new int[10];
		int i;
		for(i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		s.close();
		System.out.print("3의 배수는 ");
		for(int n : num) {
			if(n % 3 == 0)
				System.out.print(n + " ");
		}

	}

}
