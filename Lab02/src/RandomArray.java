import java.util.Scanner;
import java.util.Arrays;
public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int number = s.nextInt();
		s.close();
		int n[] = new int[100];
		int truth[] = new int[100];
		Arrays.fill(truth, 0);
		int count = 0;
		int i = 0;
		int c = 0;
		
		while(true) {
			int num = (int)(Math.random()*100 + 1);
			if(truth[num] == 0) {
				n[i] = num;
				truth[num] = 1;
				i++;
				count ++;
			}
			if(count == number)
				break;
		}
		for(int j = 0; j < number; j++) {
			System.out.print(n[j] + " ");
			c++;
			if(c % 10 == 0)
				System.out.println(" ");
			}
		}
	}

