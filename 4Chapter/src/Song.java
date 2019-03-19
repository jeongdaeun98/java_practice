import java.util.Scanner;

public class Song {

	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() {
		this(0, "�� �� ����", "�� �� ����" ,"�� �� ����");
	}
	public Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
		
		
	}
	public void show() {
		System.out.print(year + "�� " + country + "������ " + artist + "�� �θ� " + title);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�뷡 ����>>");
		String title = s.nextLine();
		System.out.print("���� �̸�>>");
		String artist = s.nextLine();
		System.out.print("��ǥ �⵵>>");
		int year = s.nextInt();
		System.out.print("����>>");
		String country = s.nextLine();
		
		Song sing = new Song(year, country, artist, title);
		
		sing.show();
		
		s.close();

	}

}
