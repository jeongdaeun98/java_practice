
public class Person {
private String name;
private String address;
private int phoneNumber;

public Person(String name,String address, int phoneNumber) {
	this.name = name;
	this.address = address;
	this.phoneNumber = phoneNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}


}
