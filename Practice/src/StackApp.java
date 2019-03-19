import java.util.Scanner;
public class StackApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >>");
		int limit = scan.nextInt();
		boolean git = true;
		String val;
		StringStack stack = new StringStack(limit);
		while(true) {
			System.out.print("문자열 입력 >> ");
			val = scan.next();
			if(val.equals("그만")) break;
			boolean boo = stack.push(val);
			if(!boo)
				System.out.println("스택이 꽉 차서 푸시 불가!");
	}

		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = stack.length();
		for(int i = 0; i <= len; i++) {
			System.out.print(stack.pop()+" ");
		}
}
}
