import java.util.Scanner;
class Person1{
	private String name;
	private int n[] = new int [3];
	
	public Person1(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setNum(int n[]) {
		this.n = n;
	}
	public boolean equalNum() {
		if(this.n[0] == this.n[1] && this.n[1] == this.n[2] && this.n[0] == this.n[2])
			return true;
		else
			return false;
	}
	
}
public class GamblingSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String name;
		int j = 0;
		int n[] = new int [3];
		System.out.print("���� ���ӿ� ������ ���� ����>>");
		int i = s.nextInt();
		Person1 p[] = new Person1[i];
		for(i = 0; i < p.length; i++) {
			System.out.print(i+1 + "��° ���� �̸�>>");
			name = s.next();
			p[i] = new Person1(name);
		}
		s.nextLine();
		i = 0;
		while(true) {
			if(i == p.length) i = 0;
			System.out.print("[" + p[i].getName() + "]: <Enter>");
			s.nextLine();
			for(j = 0; j < n.length; j++)
				n[j] = (int)(Math.random()*3 + 1);
			p[i].setNum(n);
			for(j = 0; j < n.length; j++)
				System.out.print("\t"+ n[j] + "\t");
			if(p[i].equalNum()) {
				System.out.println(p[i].getName()+"���� �̰���ϴ�!");
				break;
			}
			else
				System.out.println("�ƽ�����!");
			i++;
		}
s.close();
	}

}
