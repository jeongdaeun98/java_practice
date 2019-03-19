
class Student extends Human{
	private String major;
	private int slD;
	
	public Student(String name,int age,String major,int slD){
		super(name,age);
		this.major = major;
		this.slD = slD;
		
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + " , 전공 : " + major + ", 학번 : " + slD; 
	}
	
}