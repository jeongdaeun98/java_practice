import java.util.Scanner;
public class ScoreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner s = new Scanner(System.in);
		int i, count;
		while(true) {
			count = 0;
			System.out.print("과목 이름>>");
			String str = s.next();
			if(str.equals("그만"))
				break;
			
			for(i = 0; i < course.length; i++) {
				if(str.equals(course[i])) {
					System.out.println(str+"의 점수는 " + score[i]);
					count++;
				}
			}
			if(count == 0)
				System.out.println("없는 과목입니다.");
			}
			
			s.close();
		}
		
	}


