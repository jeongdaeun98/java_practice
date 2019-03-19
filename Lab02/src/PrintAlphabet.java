import java.util.Scanner;
public class PrintAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		String alphabet = s.next();
		char c = alphabet.charAt(0);
		s.close();
		char k;
		k = c;
		
		for(char i = 97; i <= c; i++) {
			for(char j = 97; j <= k; j++) {
				System.out.print(j);
			}
			k--;
			System.out.println(" ");
		}

	}

}
