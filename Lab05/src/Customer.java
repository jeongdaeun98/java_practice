
public class Customer extends Person{
	private int customerNumber;
	private int mile;
	
	public Customer(String name,String address, int phoneNumber, int customerNumber, int mile) {
		super(name, address, phoneNumber);
		this.customerNumber = customerNumber;
		this.mile = mile;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getMile() {
		return mile;
	}
	public void setMile(int mile) {
		this.mile = mile;
	}
	
}
