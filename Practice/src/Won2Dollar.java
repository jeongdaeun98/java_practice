
public class Won2Dollar  extends Converter{

	public Won2Dollar(double ratio){
		this.ratio = ratio;
	}
	protected double convert(double src) {
		double dol;
		dol = src / ratio;
		return dol;
	}
	protected String getSrcString() {
		String won = "��";
		return won;
	}
	protected String getDestString() {
		String dollar = "�޷�";
		return dollar;
	}
	
}
