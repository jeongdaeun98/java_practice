import java.util.Scanner;

class Person {
	private String name;
	private int n[] = new int [3];
	
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void putNumber(int n[]) {
		this.n = n;
	}
	public boolean equalNumber() {
		if(this.n[0] == this.n[1] && this.n[0] == this.n[2] && this.n[1] == this.n[2])
			return true;
		else
			return false;
			
	}
}
public class Gambling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int []n = new int [3];
		String name;
		Person p[] = new Person[2];
		int i,j;
		for(i = 0; i < p.length; i++) {
			System.out.print(i+1 + "번째 선수 이름 >> ");
			name = s.next();
			p[i] = new Person(name);
		}
		s.nextLine();
		i = 0;
		while(true) {
			if(i == 2) i = 0;
			System.out.print("["+p[i].getName() + "]: <Enter>");
			s.nextLine();
			for(j = 0; j < n.length; j++) {
				n[j] = (int)(Math.random()*3 + 1);
				}
			p[i].putNumber(n);
			for(j = 0; j < n.length; j++) {
				System.out.print("\t" + n[j] + "\t");
			}
			if(p[i].equalNumber()) {
				System.out.println(p[i].getName() + "님이 이겼습니다!");
				break;
			}
			else
				System.out.println("아쉽군요!");
			i++;
			
		}
		s.close();
		

	}

}
