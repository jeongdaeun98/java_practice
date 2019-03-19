import java.util.Scanner;
public class Won2Dollar extends Conerter {

	Scanner s = new Scanner(System.in); 
	
	protected Won2Dollar (double ratio) {
		super.ratio = ratio;
	}
	protected double convert(double src) {
		src = src / super.ratio;
		return src;
		
	}
	protected String srcString() {
		return "¿ø";
		
	}
	protected String destString() {
	
		return "´Þ·¯";
	}
	
}
