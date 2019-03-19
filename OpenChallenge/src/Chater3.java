import java.util.Scanner;
import java.util.Random;
public class Chater3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		System.out.println("0-99");
		Random r = new Random();
		int num;
		int i = 1;
		int k = r.nextInt(100);
		int max = 99; int min = 0;
		
		while(true) {
			System.out.print(i + ">>");
			num = s.nextInt();
			if(k > num) {
				System.out.println("더 높게");
				min = num;
				i++;
				System.out.println(min + "-" + max);
			}
			else if(k < num) {
				System.out.print("더 낮게");
				max = num;
				i++;
				System.out.println(min + "-" + max);
			}
			if(k == num) { 
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				String str = s.next();
				if(str.equals("y")) {
					k = r.nextInt(100);
					System.out.println("수를 결정하였습니다. 맞추어 보세요");
					System.out.println("0-99");
					max = 99;
					min = 0;
					i = 0;
					continue;
				}
				else {
					s.close();
					break;
				}
			}
			
		}

	}

}
