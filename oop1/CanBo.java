package oop1;

public class CanBo {
private String name;
private int age;
private String gender;
private String address;

public CanBo() {
	
}

public CanBo(String name, int age, String gender, String address) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.address = address;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public void display() {
	System.out.println("Name: " + this.getName() + " | Age: " + this.getAge() + " | Gender: " + this.getGender() + " | Address: " + this.getAddress());
}


}
