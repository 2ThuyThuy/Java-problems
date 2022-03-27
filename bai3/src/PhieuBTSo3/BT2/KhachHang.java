package PhieuBTSo3.BT2;

import java.util.Scanner;

public abstract class KhachHang {
    protected String maKhachHang;
    protected String hoTen;
    protected NgayThang ngayRaHoaDon = new NgayThang();

    protected Double soLD;
    protected Double donGia;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma Khach Hang: ");
        maKhachHang = sc.nextLine();
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        ngayRaHoaDon.nhap();
        System.out.print("Số lượng điện: ");
        soLD = sc.nextDouble();
        System.out.print("Đơn giá: ");
        donGia = sc.nextDouble();
    }

    public abstract double thanhTien();


}
