
public class IPTV extends ColorTV{

	private String ip;
	public IPTV(String ip, int size, int color) {
		super(size,color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 " + ip + "주소의 " + super.getSize() +"인치 " + super.getColor() +"컬러");
	}
}
