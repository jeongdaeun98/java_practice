import java.util.Scanner;

public class Lab1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int second;
		
		if(a > b) {
			if(a > c) {
				if(b > c) {
					second = b;
				}
				else {
					second = c;
				}
			}
			else {				
					second = a;
				}
		}
			else {
				if(b > c) {
					
					if(a > c) {
						second = a;
					}
					else {
						second = c;
					}
				}
				else {
					second = b;
				}
				}
		System.out.println("중간 값은 " + second);
			}
				
		}

