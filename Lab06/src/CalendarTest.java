import java.util.Calendar;
public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("현재 시간은 "+ hour + "시 " + minute + "분입니다.");
		if(hour <= 12 && hour >=4)
			System.out.println("Good Morning");
		else if(hour > 12 && hour <=18)
			System.out.println("Good Afternoon");
		else if(hour > 18 && hour <=22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
		

	}

}
