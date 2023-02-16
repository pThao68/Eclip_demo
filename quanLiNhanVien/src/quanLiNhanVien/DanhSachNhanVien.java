package quanLiNhanVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachNhanVien {
	
	private ArrayList<NhanVien> list = new ArrayList<>();

	
	public void HienThiTop5() {
		Collections.sort(list,(a,b)->(int)(b.getThuNhap()-a.getThuNhap()));
		System.out.print("Danh sach nhan vien co thu nhap cao nhat");
		for(int i =0; i<5; i++) {
			System.out.println();
			list.get(i).xuat();
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		list.clear();
		
		do {
			
			System.out.println("Nhap loai nhan vien (Nhap rong de thoat) \n 1.Hanh chinh \n 2.Truong phong \n 3. Tiep thi ");
			String loai = sc.nextLine();
			
			if(loai == null || loai.equals(""))
				break;
			
			int iloai = Integer.parseInt(loai);
			
			switch (iloai) {
			case 1: {
				NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
				nvhc.nhap(sc);
				list.add(nvhc);
				break;
			}
			case 2: {
				TruongPhong tp = new TruongPhong();
				
				tp.nhap(sc);
				list.add(tp);
				break;
			}
			case 3: {
				NhanVienTiepThi nvtt = new NhanVienTiepThi();
				nvtt.nhap(sc);
				list.add(nvtt);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + loai);
			}
			
			
		}while(true);
		
	}
	
	
	public void xuat() {
		System.out.println("Danh sach nhan vien: ");
		for(NhanVien nv : list) {
			if(nv instanceof NhanVienHanhChinh) {
				((NhanVienHanhChinh)nv).xuat();
			}
			else if(nv instanceof NhanVienTiepThi) {
				((NhanVienTiepThi)nv).xuat();
			}
			else if(nv instanceof TruongPhong) {
				((TruongPhong)nv).xuat();
			}
			System.out.println("\n---------------------");
		}
		
	}

	
	public void timVaHienThiTheoMa(Scanner s ) {
		
		System.out.print("Nhap ma can tim:  ");
		String ma = s.nextLine();
		NhanVien nvFound = null;
		
		for(NhanVien nv : list) {
			if(nv.getMa().equalsIgnoreCase(ma)) {
				//System.out.println("Thong tin nhan vien tim thay");
				nvFound=nv;
				break;
			}
		}
		if (nvFound != null) {
			System.out.println("Thong tin nhan vien theo ma: ");
			nvFound.xuat();
			
		}else {
			System.out.println("Khong tim thay nhan vien co ma "+ ma);
		}
		
	}
	
	
	public void xoaNhanVienTheoMa (Scanner s) {
		System.out.println("Xoa thong tin nhan vien theo ma");
		System.out.println("Nhap ma nhan vien can xoa");
		String ma = s.nextLine();
		NhanVien nvFound = null;
		for(NhanVien nv : list) {
			if(nv.getMa().equalsIgnoreCase(ma)) {
				 nvFound= nv;
				break;
			}
		}
		if(nvFound != null) {
			list.remove(nvFound);
			System.out.println("Nhan vien da duoc xoa");
		}else {
			System.out.printf("Nhan vien co ma %s khong tim thay trong danh sach \n",ma);
		}
	}


	public void capNhatTheoMa(Scanner s) {
		System.out.println("Cap nhat thong tin nhan vien theo ma");
		System.out.println("Nhap ma nhan vien: ");
		
		String ma = s.nextLine();
		NhanVien nvFound = null;
		
		for(NhanVien item: list) {
			if(item.getMa().equalsIgnoreCase(ma)) {
				nvFound = item;
				break;
			}
		}
		
		if(nvFound != null) {
			if(nvFound instanceof NhanVienHanhChinh) {
				((NhanVienHanhChinh)nvFound).nhap(s);
			}else if (nvFound instanceof TruongPhong) {
				((TruongPhong)nvFound).nhap(s);
			}
			else if (nvFound instanceof NhanVienTiepThi) {
				((NhanVienTiepThi)nvFound).nhap(s);
			}
		}
		else {
			System.out.println("Khong tim thay ma nhan vien"+ ma);
		}
	}


	
	public void timTheoLuong(Scanner s) {
		System.out.println("Nhap khoang luong thap nhat: ");
		double min = s.nextDouble();
		
		System.out.println("Nhap khoang luong cao nhat: ");
		double max = s.nextDouble();
		
		boolean nvFound = false;
		
		for(NhanVien nhanvien : list) {
			if(min<=nhanvien.getLuong()&& nhanvien.getLuong()<=max) {
				nhanvien.xuat();
				System.out.println();
				nvFound = true;
				
			}
		}
		if(nvFound= false) {
			System.out.println("Khogn co nhan vien nao co luong trong khoang can tim");
		}
		
	}


	public void sapxepTheoTen() {
		Collections.sort(list,(a,b)->a.hoTen.compareTo(b.hoTen));
	}
	
	public void sapxepTheoThuNhap() {
		Collections.sort(list, (a,b)->(int)(a.getThuNhap()-b.getThuNhap()));
	}

}
