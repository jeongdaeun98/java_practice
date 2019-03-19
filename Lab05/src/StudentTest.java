import java.util.Scanner;


public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Human human[] = new Human[3];
		Student student[] = new Student[3];
		int i;
		String name;
		int age;
		int slD;
		String major;
		for(i = 0; i < human.length; i++) {
			System.out.print("[" + (i+1) + "] Human 입력 : ");
			name = s.next();
			age = s.nextInt();
			human[i] = new Human(name,age);
			
		}
		for(i = 0; i < student.length; i++) {
			System.out.print("[" + (i+1) + "] Student 입력 : ");
			name = s.next();
			age = s.nextInt();
			major = s.next();
			slD = s.nextInt();
			student[i] = new Student(name, age, major, slD);
			
		}
		for(i = 0; i < human.length; i++) {
			System.out.println(human[i].toString());
		}
		for(i = 0; i < student.length; i++) {
			System.out.println("[학생 정보]"+student[i].toString() + "]");
		}
		s.close();
	}

}
