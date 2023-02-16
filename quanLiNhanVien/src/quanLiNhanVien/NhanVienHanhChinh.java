package quanLiNhanVien;

public class NhanVienHanhChinh extends NhanVien {

	
	
	public NhanVienHanhChinh() {
		super("Hanh Chinh");
		// TODO Auto-generated constructor stub
	}

	public NhanVienHanhChinh(String ma, String hoTen, String loai, double luong) {
		super(ma, hoTen,"Hanh Chinh", luong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getThuNhap() {
		return luong;
	}

	

}
