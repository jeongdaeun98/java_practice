import java.util.*;
public class MovieTest {

	public static void main(String[] args) {
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
			System.out.println("4. 종료");
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
				movi[i] = new Movie(director,year,genre);
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
			else if(num == 4)
					break;
				
			}
		
		sc.close();	
	}

}
