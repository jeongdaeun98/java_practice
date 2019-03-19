import java.util.Scanner;

public class Song {

	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		this(0, "알 수 없음", "알 수 없음" ,"알 수 없음");
	}
	public Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
		
		
	}
	public void show() {
		System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("노래 제목>>");
		String title = s.nextLine();
		System.out.print("가수 이름>>");
		String artist = s.nextLine();
		System.out.print("발표 년도>>");
		int year = s.nextInt();
		System.out.print("국적>>");
		String country = s.nextLine();
		
		Song sing = new Song(year, country, artist, title);
		
		sing.show();
		
		s.close();

	}

}
