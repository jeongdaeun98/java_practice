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
		System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
		name = s.next();
		tel = s.next();
		
	}
	public String get(String name) {
		if(name.equals(this.name)) {
			System.out.println(name + "의 번호는 " + tel + " 입니다.");
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
		System.out.print("인원수>>");
		int personNumber = s.nextInt();
		Phone pon[] = new Phone[personNumber];
		for(i = 0; i < pon.length; i++)
			pon[i] = new Phone(i);
		for(i = 0; i < pon.length; i++) {
			pon[i].set();
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.print("검색할 이름>>");
			name = s.next();
			if(name.equals("그만"))
				break;
			for(i = 0; i < pon.length; i++) {
				if(name.equals(pon[i].get(name))) {
					bool = 1;
					break;
				}
			}
			if(bool == 0)
				System.out.println(name + " 이 없습니다.");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook p = new PhoneBook();
		p.run();

	}

}
