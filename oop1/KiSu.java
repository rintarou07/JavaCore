package oop1;

public class KiSu extends CanBo {
private String nganhDaoTao;
public KiSu() {
	
}
public KiSu(String name, int age, String gender, String address, String nganhDaoTao) {
	super(name, age, gender, address);
	// TODO Auto-generated constructor stub
	this.nganhDaoTao = nganhDaoTao;
}
public String getNganhDaoTao() {
	return nganhDaoTao;
}
public void setNganhDaoTao(String nganhDaoTao) {
	this.nganhDaoTao = nganhDaoTao;
}
public void display() {
	System.out.println("Name: " + this.getName() + " | Age: " + this.getAge() + " | Gender: " + this.getGender() + " | Address: " + this.getAddress() + " | Nganh Dao Tao: " + this.nganhDaoTao);
}


}
