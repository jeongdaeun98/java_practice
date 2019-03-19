import java.util.*;
public class LocationManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Location locat[] = new Location[4];
		Scanner sc = new Scanner(System.in);
		int xn, yn;
		String cityName, name,x,y;
		String city[] = new String[4];
		HashMap<String, Location> h = new HashMap<String, Location>();
		System.out.println("도시,경도,위도를 입력하세요.");
		for(int i = 0; i < locat.length; i++) {
			System.out.print(">>");
			name = sc.next();x = sc.next();y = sc.next();
			String s[] = name.split(","); String t[] = x.split(","); String r[] = y.split(",");
			city[i] = s[0];
			xn = Integer.parseInt(t[0]);
			yn = Integer.parseInt(r[0]);
			locat[i] = new Location(xn, yn);
			h.put(city[i],locat[i]);
		}
		System.out.println("---------------------------");
		Set<String> keys = h.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String cname = it.next();
			Location lo = h.get(cname);
			System.out.println(cname+ " " +lo.getLatitude() + " " + lo.getLongitude());
		}
		System.out.println("---------------------------");
		int count = 0;
		while(true) {
			count = 0;
			System.out.print("도시 이름 >>");
			cityName = sc.next();
			if(h.containsKey(cityName)) {
				Location lo = h.get(cityName);
				System.out.println(cityName + "\t" + lo.getLatitude()+ "\t" + lo.getLongitude());
				count++;
			}
			if(cityName.equals("그만"))break;
			if(count == 0) System.out.println(cityName + "는 없습니다.");
			
		}
		sc.close();
	}

}
