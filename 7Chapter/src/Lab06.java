import java.util.HashMap;
import java.util.Scanner;
class Location{
	private int latitude;
	private int longitude;
	
	public Location(int latitude, int longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public int getLatitude() {
		return latitude;
	}
	public int getLongitude() {
		return longitude;
	}
}
public class Lab06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Location locat[] = new Location[4];
		Scanner s = new Scanner(System.in);
		int x, y;
		String city[] = new String [4];
		HashMap<String, Location> h = new HashMap<String, Location>();
		System.out.println("도시,경도,위도를 입력하세요.");
		for(int i = 0; i < locat.length; i++) {
			System.out.print(">>");
			city[i] = s.next();
			x = s.nextInt();
			y = s.nextInt();
			locat[i] = new Location(x, y);
			h.put(city[i],locat[i]);
		}
		System.out.println("---------------------------");
		for(int i = 0; i < h.size(); i++) {
			System.out.println(city[i]+ " " +locat[i].getLatitude() + " " + locat[i].getLongitude());
		}
		System.out.println("---------------------------");
		while(true) {
			System.out.print("도시 이름 >>");
			
		}
		
		

	}

}
