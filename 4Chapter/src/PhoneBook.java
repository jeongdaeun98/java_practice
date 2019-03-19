import java.util.Scanner;

class Phone{
	Scanner s = new Scanner(System.in);
	String name;
	String tel;
	int personNumber;
	
	public Phone(int personNumber) {
		this.personNumber = personNumber;
		
	}
	public void set() {
		System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
		name = s.next();
		tel = s.next();
		
	}
	public String get(String name) {
		if(name.equals(this.name)) {
			System.out.println(name + "�� ��ȣ�� " + tel + " �Դϴ�.");
		}
		return this.name;
		}
}
public class PhoneBook {
	String name;

	private PhoneBook() {
		
	}
	private void run() {
		int i;
		int bool = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("�ο���>>");
		int personNumber = s.nextInt();
		Phone pon[] = new Phone[personNumber];
		for(i = 0; i < pon.length; i++)
			pon[i] = new Phone(i);
		for(i = 0; i < pon.length; i++) {
			pon[i].set();
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			name = s.next();
			if(name.equals("�׸�"))
				break;
			for(i = 0; i < pon.length; i++) {
				if(name.equals(pon[i].get(name))) {
					bool = 1;
					break;
				}
			}
			if(bool == 0)
				System.out.println(name + " �� �����ϴ�.");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook p = new PhoneBook();
		p.run();

	}

}
