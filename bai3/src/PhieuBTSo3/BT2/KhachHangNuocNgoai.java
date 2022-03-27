package PhieuBTSo3.BT2;


import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang{
    private String quocTich;

    @Override
    public double thanhTien() {
        return soLD*donGia;
    }

    public void  nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Quốc tịch: ");
        quocTich = sc.nextLine();
    }

    public static void InTT(){
        System.out.println("Khách hàng nước ngoài");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %n",
                "MaKhachHang","HoTen","NgayRaHoaDon","QuocTich","SoLuong","DonGia","ThanhTien");

    }

    public void xuat(){
        System.out.printf("%15s %15s %15s %15s %15.3f %15.3f %15.3f %n",
                maKhachHang,hoTen,ngayRaHoaDon.toString(),quocTich,soLD,donGia,thanhTien());

    }
}
