package PhieuBTSo3.BT2;

import java.util.Scanner;

public abstract class KhachHang {
    protected String maKhachHang;
    protected String hoTen;
    protected NgayThang ngayRaHoaDon;
    protected String doiTuongKhachHang;
    protected Double soLD;
    protected Double donGia;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma Khach Hang: ");
        maKhachHang = sc.nextLine();
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        ngayRaHoaDon.nhap();
        System.out.println("Chon doi tuong khach hang");
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
        System.out.print("Số lượng điện: ");
        soLD = sc.nextDouble();
        System.out.print("");
    }

    public abstract double thanhTien();


    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public NgayThang getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(NgayThang ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public String getDoiTuongKhachHang() {
        return doiTuongKhachHang;
    }

    public void setDoiTuongKhachHang(String doiTuongKhachHang) {
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public Double getSoLD() {
        return soLD;
    }

    public void setSoLD(Double soLD) {
        this.soLD = soLD;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }
}
