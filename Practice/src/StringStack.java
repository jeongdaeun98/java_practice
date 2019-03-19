
public class StringStack implements Stack {

	String val;
	private String[] s;
	private int limit = 0;
	private int count = 0;
	public StringStack(int limit) {
		this.limit = limit;
		this.s = new String[limit];
	}

	public int capacity() {
		return this.limit;
	}
	public int length() {
		return this.count;
	}

	public String pop() {
		val = s[count];
		count--;
		return val;
	}
	public boolean push(String val) {
		if(this.length() == this.capacity()) {
			count--;
			return false;
		}
		else {
			s[count] = val;
			count++;
			return true;
		}	
	}
		
	
}
