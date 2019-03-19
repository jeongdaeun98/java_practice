import java.util.Scanner;

public class Lab11Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		s.close();
		switch(month) {
		case 3 : case 4 : case 5 :
			System.out.print("봄");
			break;
		case 6 : case 7 : case 8 :
			System.out.print("여름");
			break;
		case 9 : case 10 : case 11 :
			System.out.print("가을");
			break;
		case 12 : case 1 : case 2 :
			System.out.print("겨울");
			break;
		default :
			System.out.print("잘못입력");
		}

	}

}
