package oop1;

import java.util.*;
import java.util.Scanner;

public class CanBoManager {
	public  ArrayList<CanBo> CBList = new ArrayList<CanBo>() ;
	public  boolean running = true;

	public CanBoManager() {
	}

	public void addCanBo(CanBo person) {
		CBList.add(person);
	}

	public void searchCanBo(String input) {
		for (int i = 0; i < CBList.size(); i++) {
			if (CBList.get(i).getName().toUpperCase().indexOf(input) != -1 || CBList.get(i).getName().toLowerCase().indexOf(input) != -1 ) {
				CBList.get(i).display();
			}
		}
	}

	public  void displayList() {
		for (int i = 0; i < CBList.size(); i++) {
			CBList.get(i).display();
		}
	}

	public  void exitprogram() {
		running = false;
	}

	public static void main(String[]args) {
		CanBoManager myCanBoList = new CanBoManager();
		while (myCanBoList.running) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1. Them Can Bo");
			System.out.println("2. Tim Kiem Can Bo");
			System.out.println("3. Hien Thi Danh Sach Can Bo");
			System.out.println("4. Thoat Chuong Trinh");
			// Scanner
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Chuc vu can bo:");
				System.out.println("1. Cong Nhan");
				System.out.println("2. Ki Su");
				System.out.println("3. Nhan Vien");
				int roleNumber = sc.nextInt();
				System.out.print("Nhap Ten: ");
				String name = sc.next();
				System.out.println("");
				System.out.print("nhap Tuoi: ");
				int age = sc.nextInt();
				sc.nextLine(); // used to fix skip input
				System.out.println("");
				System.out.print("Nhap gioi tinh: ");
				String gender = sc.nextLine();
				System.out.println("");
				System.out.print("Nhap Dia Chi: ");
				String address = sc.next();
				System.out.println("");
				switch (roleNumber) {
				case 1:
					System.out.println("Nhap level (1-10): ");
					int level = sc.nextInt();
					System.out.println(level);
					myCanBoList.addCanBo(new CongNhan(name, age, gender, address, level));
					break;
				case 2:
					System.out.println("Nhap nganh: ");
					String nganh = sc.next();
					myCanBoList.addCanBo(new KiSu(name, age, gender, address, nganh));
					break;
				case 3:
					System.out.println("Nhap cong viec: ");
					String job = sc.next(); 
					myCanBoList.addCanBo(new NhanVien(name, age, gender, address, job));
					break;
				}

				break;
			case 2:
				System.out.println("Nhap ten ban muon tim kiem:");
				String input = sc.next();
				myCanBoList.searchCanBo(input);
				break;
			case 3:
				System.out.println("-------------- Danh sach can bo -------------");
				myCanBoList.displayList();
				break;
			case 4:
				myCanBoList.exitprogram();
				break;

			}

		}
	}

}
