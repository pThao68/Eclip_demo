package quanLiNhanVien;

import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien {
	private double doanhSo;
	private double hoaHong;
	
	
	public NhanVienTiepThi() {
		super("Tiep Thi");
		// TODO Auto-generated constructor stub
	}



	public NhanVienTiepThi(String ma, String hoTen, String loai, double luong, double doanhSo, double hoaHong) {
		super(ma, hoTen, "Tiep thi", luong);
		
		
		this.doanhSo= doanhSo;
		this.hoaHong= hoaHong;
	}
	
	public void nhap(Scanner sc) {
		super.nhap(sc);
		System.out.print("Doanh so: ");
		doanhSo = sc.nextDouble();
		
		System.out.print("Hue hong: ");
		hoaHong= sc.nextDouble();
		sc.nextLine();
		
	}

	public void xuat() {
		super.xuat();
		
		System.out.printf(" - Doanh so: %f -Hoa hong: %f", doanhSo,hoaHong);
	}
	
	public double getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(double doanhSo) {
		this.doanhSo = doanhSo;
	}
	public double getHoaHong() {
		return hoaHong;
	}
	public void setHoaHong(double hoaHong) {
		this.hoaHong = hoaHong;
	}



	@Override
	public double getThuNhap() {
		// TODO Auto-generated method stub
		return luong + doanhSo + hoaHong/100;
	}
	

}
