package oop1;

public class NhanVien extends CanBo {
	private String job;
	public NhanVien() {}
	public NhanVien(String name, int age, String gender, String address, String job) {
		super(name, age, gender, address);
		// TODO Auto-generated constructor stub
		this.job = job;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void display() {
		System.out.println("Name: " + this.getName() + " | Age: " + this.getAge() + " | Gender: " + this.getGender() + " | Address: " + this.getAddress() + " | Job: " + this.job);
	}
	
}
	
