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
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 출력");
			System.out.println("3. 영화 정보 검색");
			System.out.println("4. 파일 저장");
			System.out.println("5. 파일 열기");
			System.out.println("6. 종료");
			System.out.print("메뉴입력>>");
			num = sc.nextInt();
			if(num == 1) {
				System.out.print("제목:");
				movieName = sc.next();
				sc.nextLine();
				System.out.print("감독:");
				director = sc.next();
				sc.nextLine();
				System.out.print("장르:");
				genre = sc.next();
				sc.nextLine();
				System.out.print("년도:");
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
					System.out.print("[제목:" + movieName + ", ");
					System.out.print("감독:" + move.getDirector() + ", ");
					System.out.print("장르:" + move.getGenre() + ", ");
					System.out.print("년도:" + move.getYear() + "]\n");
				}
			}
			else if(num == 3) {
				System.out.print("검색 제목 입력:");
				movieName = sc.next();
				Set<String> keyss = h.keySet();
				Iterator<String> ite = keyss.iterator();
				while(ite.hasNext()) {
					if(ite.next().equals(movieName)) {
						move = h.get(movieName);
						System.out.print("[제목:" + movieName + ", ");
						System.out.print("감독:" + move.getDirector() + ", ");
						System.out.print("장르:" + move.getGenre() + ", ");
						System.out.print("년도:" + move.getYear() + "]\n");	
					}
				}
			}
			else if(num == 4) {
				try {
					ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movie.dat"));
					oos.writeObject(h);
					oos.close();
					System.out.println("movie.dat에 저장되었습니다."  );
				}
				catch(IOException e) {
					System.out.println("입출력 오류");
					e.printStackTrace();
				}
			}
			else if(num == 5) {
				i = 0;
				try {
					ObjectInputStream ois = new ObjectInputStream(new FileInputStream("movie.dat"));
					h = (HashMap)ois.readObject();
					ois.close();
					System.out.println("movie.dat으로부터 정보를 불러왔습니다.");
				}
				catch(IOException e) {
					System.out.println("입출력 오류");
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
