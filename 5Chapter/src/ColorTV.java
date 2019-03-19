
public class ColorTV extends TV{

	private int color;
	public ColorTV(int size, int color) {
		super(32);
		this.color = color;
	}
	public int getColor() {
		return color;
	}
	public void printProperty(){
		
		System.out.println(super.getSize() + "인치 " + color + "컬러");
		

	}

}
