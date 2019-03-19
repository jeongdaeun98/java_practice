import java.util.Scanner;

public class Lab1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x1, y1 입력>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		System.out.print("x2, y2입력>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		scanner.close();
		
		
		if(100 <= x2 && 100 <= y2 && 200 >= x1 && 200 >= y1)
				System.out.println("충돌 발생");
		else
			System.out.println("충돌 없음");
			
	}

}
