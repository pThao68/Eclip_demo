package quanLiNhanVien;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DanhSachNhanVien ds = new DanhSachNhanVien();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int choice = 0;
			 System.out.println("----------------------");
			 System.out.println("Chuong trinh quan lí nhan vien");
			 System.out.println("| 1. Nhap danh sach nhan vien");
			 System.out.println("| 2. Xuat danh sach nhan vien");
			 System.out.println("| 3. Hien thi top 5 danh sach nhan vien");
			 System.out.println("| 4. Sap xep danh sach theo ten");
			 System.out.println("| 0.Thoat chuong trinh");
			 choice = s.nextInt();
			 s.nextLine();
			 
			 if(choice==0) {
				 System.exit(0);
				 System.out.println("Da thoat chuong trinh");
			 }
			 
			 switch(choice) {
			 case 1:
				 ds.nhap();
				 break;
				 
			 case 2:
				 ds.xuat();
				 break;
				 
			 case 3:
				 ds.HienThiTop5();
				 break;
			 case 4:
				 ds.sapxepTheoTen();
				 ds.xuat();
				 break;
			 }
			 System.out.println("Nhap phim ENTER DE TIEP TUC");
			 s.nextLine();
			 
			 try {
				 
				 Runtime.getRuntime().exec("cls");
				 
				
			} catch (IOException e) {
				// TODO: handle exception
			}
			 
			 
		}
//		ds.nhap();
//		ds.sapxepTheoTen();
//		ds.sapxepTheoThuNhap();
//		ds.xuat();
//		ds.HienThiTop5();
//		Scanner s= new Scanner(System.in);
////		ds.timVaHienThiTheoMa(s);
////		ds.xoaNhanVienTheoMa(s);
////		ds.xuat();
////		
////		ds.capNhatTheoMa(s);
////		
////		System.out.println("-------------------------------------------------");
////		ds.xuat();
//		
//		ds.timTheoLuong(s);
	}
}
