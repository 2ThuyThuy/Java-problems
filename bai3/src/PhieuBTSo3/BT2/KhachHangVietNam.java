package PhieuBTSo3.BT2;

import java.util.Scanner;

public class KhachHangVietNam extends KhachHang{
    private String doiTuongKhachHang;
    private double dinhMuc;

    @Override
    public double thanhTien() {
        double thanhtien;
        if( soLD <= dinhMuc)
            thanhtien = soLD*donGia;
        else
            thanhtien = soLD*donGia*dinhMuc + (soLD-dinhMuc)*donGia*2.5;
        return thanhtien;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap(); // supper là của cha
        System.out.print("Định mức");
        dinhMuc = sc.nextInt();
        System.out.println("Chọn đối tượng khách hàng");
        System.out.println("1. sinh hoạt");
        System.out.println("2. kinh doanh");
        System.out.println("3. sản xuất");
        int kt = 0;
        do {
            int chon = sc.nextInt();

            switch (chon) {
                case (1):
                    doiTuongKhachHang = "sinh hoạt";
                    kt = 0;
                    break;
                case (2):
                    doiTuongKhachHang = "kinh doanh";
                    kt = 0;
                    break;
                case (3):
                    doiTuongKhachHang = "sản xuất";
                    kt = 0;
                    break;
                default:
                    System.out.println("Phải nhập số mình chọn, nhập lại đi");
                    kt = 1;
                    break;
            }
        } while(kt == 1);
    }

    public static void InTT(){
        System.out.println("Khách hàng Việt Nam");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %n",
                "MaKhachHang","HoTen","NgayRaHoaDon","DoiTuong","SoLuong","DonGia","DinhMuc","ThanhTien");
    }
    public void xuat(){
        System.out.printf("%15s %15s %15s %15s %15.3f %15.3f %15.3f %15.3f %n",
                maKhachHang,hoTen,ngayRaHoaDon.toString(),doiTuongKhachHang,soLD,donGia,dinhMuc,thanhTien());
    }
}
