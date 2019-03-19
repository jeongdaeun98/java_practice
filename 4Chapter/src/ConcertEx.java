import java.util.Scanner;

class Concert {
	static String[] s = { "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "---" };
	static String[] a = { "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "---" };
	static String[] b = { "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "--- ", "---" };
	static String name;
	static int num;
	Scanner sc = new Scanner(System.in);

	public void reservation() {
		while(true) {
			System.out.println("좌석구분 S(1), A(2), B(3)>>");
			int number = sc.nextInt();
			switch(number) {
			case 1 :
				System.out.println("S>>" + s);
				System.out.print("이름>>");
				name = sc.next();
				System.out.print("번호>>");
				num = sc.nextInt();
				s[num-1] = name + " ";
				break;
			case 2 :
				System.out.println("A>>" + a);
				System.out.print("이름>>");
				name = sc.next();
				System.out.print("번호>>");
				num = sc.nextInt();
				a[num-1] = name;
				break;
			case 3 :
				System.out.println("B>>" + b);
				System.out.print("이름>>");
				name = sc.next();
				System.out.print("번호>>");
				num = sc.nextInt();
				b[num-1] = name;
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
				continue;
		}
			
		
	}

	public void cancel() {
		while(true) {
			System.out.println("좌석 S:1, A:2, B:3>>");
			num = sc.nextInt();
			if(num == 1) {
				System.out.print("S>>");
				for(int i = 0; i < s.length; i++)
					System.out.print(s[i]);
			System.out.println("");
			System.out.print("이름 >>");
			name = sc.next();
			for(int i = 0; i < s.length; i++) {
				if(name.equals(s[i]))
					s[i] = "---";
			}
			break;
		}
		else if(num == 2) {
			System.out.print("A>>");
			for(int i = 0; i < a.length; i++)
				System.out.print(a[i]);
			System.out.println("");
			System.out.print("이름 >>");
			name = sc.next();
			for(int i = 0; i < a.length; i++) {
				if(name.equals(a[i]))
					a[i] = "---";
			}
			break;
		}
		else if(num == 3) {
			System.out.print("B>>");
			for(int i = 0; i < b.length; i++)
				System.out.print(b[i]);
			System.out.println("");
			System.out.print("이름 >>");
			name = sc.next();
			for(int i = 0; i < b.length; i++) {
				if(name.equals(b[i]))
					b[i] = "---";
			}
			break;
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
			
		
		
	}

	public void lookUp() {

		System.out.print("S>>");
		for (int i = 0; i < s.length; i++)
			System.out.print(s[i] + " ");
		System.out.println("");
		System.out.print("A>>");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("");
		System.out.print("B>>");
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println("");

	}

	public void run() {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while (true) {
			System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4>>");
			num = sc.nextInt();
			if (num == 4)
				break;
			if (num == 1)
				reservation();
			else if (num == 2) {
				lookUp();
				System.out.println("<<<조회를 완료하였습니다.>>>");
			} else if (num == 3)
				cancel();
		}

	}
}}

public class ConcertEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concert con = new Concert();
		con.run();

	}

}
