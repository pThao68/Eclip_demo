package quanLiNhanVien;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
	
	

	private double luongTrachNhiem;

	
	
	public TruongPhong() {
		super("Truong phong");
		
		// TODO Auto-generated constructor stub
	}

	public TruongPhong(String ma, String hoTen,  String loai, double luong, double luongTrachNhiem) {
		super(ma, hoTen, "Truong phong", luong);
		this.luongTrachNhiem = luongTrachNhiem;
	}

	
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Luong trach nhiem: ");
		luongTrachNhiem= sc.nextDouble();
		
		sc.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.printf(" - Luong trach nhiem: %f", luongTrachNhiem);
	}
	
	public double getLuongTrachNhiem() {
		return luongTrachNhiem;
	}

	public void setLuongTrachNhiem(double luongTrachNhiem) {
		this.luongTrachNhiem = luongTrachNhiem;
	}

	@Override
	public double getThuNhap() {
		// TODO Auto-generated method stub
		return luong + luongTrachNhiem;
	}
	
	

}
