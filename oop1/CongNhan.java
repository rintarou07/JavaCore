package oop1;

public class CongNhan extends CanBo {
private int level;
public CongNhan() {}
public CongNhan(String name, int age, String gender, String address, int level) {
	super(name, age, gender, address);
	// TODO Auto-generated constructor stub
	this.level = level;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
public void display() {
	System.out.println("Name: " + this.getName() + " | Age: " + this.getAge() + " | Gender: " + this.getGender() + " | Address: " + this.getAddress() + " | Level: " + this.level);
}



}
