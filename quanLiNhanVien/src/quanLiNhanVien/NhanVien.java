package quanLiNhanVien;

import java.util.Scanner;

public abstract class NhanVien {
	String ma, hoTen, loai;
	double luong;
	
	public abstract double getThuNhap();
	
	
	
	public NhanVien() {
		super();
	}
	
	public NhanVien(String loai) {
	
		this.loai =loai;
	}

	public NhanVien(String ma, String hoTen, String loai,double luong) {
		
		this.ma = ma;
		this.hoTen = hoTen;
		this.luong = luong;
		this.loai = loai;
	}

	public void nhap(Scanner s) {
		System.out.print("Ma: ");
		this.ma = s.nextLine();
		System.out.print("Ho ten: ");
		this.hoTen = s.nextLine();
		
		System.out.print("Luong : ");
		this.luong = s.nextDouble();
		
		s.nextLine();
	}


	public void xuat() {
		System.out.printf("Ma: %s  - Ho ten: %s -Loai: %s Luong :%f - Thu Nhap: %s",
				ma, hoTen, loai, luong, getThuNhap());
	}


	public String getMa() {
		return ma;
	}





	public void setMa(String ma) {
		this.ma = ma;
	}





	public String getHoTen() {
		return hoTen;
	}





	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}





	public String getLoai() {
		return loai;
	}





	public void setLoai(String loai) {
		this.loai = loai;
	}





	public double getLuong() {
		return luong;
	}





	public void setLuong(double luong) {
		this.luong = luong;
	}
	
	

}
