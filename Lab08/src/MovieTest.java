import java.io.*;
import java.util.*;
@SuppressWarnings("serial")
class Movie implements Serializable {
	private String movie;
	private String director;
	private int year;
	private String genre;

	public Movie(String movie, String director, int year, String genre) {
		this.director = director;
		this.year = year;
		this.genre = genre;
		this.movie = movie;
	}
	public Movie() {
		
	}
	public String getMovie() {
		return movie;
	}
	public int getYear() {
		return year;
	}
	public String getDirector() {
		return director;
	}
	public String getGenre() {
		return genre;
	}
	
}

public class MovieTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		HashMap<String, Movie> h = new HashMap<String, Movie>();
		
		Scanner sc = new Scanner(System.in);
		Movie movi[] = new Movie[100];
		Movie move = new Movie();
		int num, year, i = 0;
		String movieName, director, genre;
		while(true) {
			System.out.println("1. ��ȭ ���� �Է�");
			System.out.println("2. ��ȭ ���� ���");
			System.out.println("3. ��ȭ ���� �˻�");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� ����");
			System.out.println("6. ����");
			System.out.print("�޴��Է�>>");
			num = sc.nextInt();
			if(num == 1) {
				System.out.print("����:");
				movieName = sc.next();
				sc.nextLine();
				System.out.print("����:");
				director = sc.next();
				sc.nextLine();
				System.out.print("�帣:");
				genre = sc.next();
				sc.nextLine();
				System.out.print("�⵵:");
				year = sc.nextInt();
				sc.nextLine();
				movi[i] = new Movie(movieName,director,year,genre);
				h.put(movieName,movi[i]);
				i++;
			}
			else if(num == 2) {
				Set<String> keys = h.keySet();
				Iterator<String> it = keys.iterator();
				while(it.hasNext()) {
					movieName = it.next();
					move = h.get(movieName);
					System.out.print("[����:" + movieName + ", ");
					System.out.print("����:" + move.getDirector() + ", ");
					System.out.print("�帣:" + move.getGenre() + ", ");
					System.out.print("�⵵:" + move.getYear() + "]\n");
				}
			}
			else if(num == 3) {
				System.out.print("�˻� ���� �Է�:");
				movieName = sc.next();
				Set<String> keyss = h.keySet();
				Iterator<String> ite = keyss.iterator();
				while(ite.hasNext()) {
					if(ite.next().equals(movieName)) {
						move = h.get(movieName);
						System.out.print("[����:" + movieName + ", ");
						System.out.print("����:" + move.getDirector() + ", ");
						System.out.print("�帣:" + move.getGenre() + ", ");
						System.out.print("�⵵:" + move.getYear() + "]\n");	
					}
				}
			}
			else if(num == 4) {
				try {
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"));
					oos.writeObject(h);
					oos.close();
					System.out.println("movie.dat�� ����Ǿ����ϴ�."  );
				}
				catch(IOException e) {
					System.out.println("����� ����");
					e.printStackTrace();
				}
			}
			else if(num == 5) {
				i = 0;
				try {
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("movie.dat"));
					h = (HashMap)ois.readObject();
					ois.close();
					System.out.println("movie.dat���κ��� ������ �ҷ��Խ��ϴ�.");
				}
				catch(IOException e) {
					System.out.println("����� ����");
					e.printStackTrace();
				}
				catch (ClassNotFoundException e) {
				e.printStackTrace();
				 }
			}
			else if(num == 6)
					break;
				
			}
		
		sc.close();	
	}

}
