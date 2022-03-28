package PhieuBTSo5;

import java.util.Scanner;

public class Hang {
    private String tenHang;
    private float soLuong,donGia;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten Hang: ");
        tenHang = sc.nextLine();
        System.out.print("So Luong: ");
        soLuong = sc.nextFloat();
        System.out.print("Don Gia: ");
        donGia = sc.nextFloat();
    }
    public float tinhTongTien(){
        return soLuong*donGia;
    }
    static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s%n","Ten Hang","SoLuong","Don Gia", "Tong Tien");
    }
    public void inDL () {
        System.out.printf("%15s %15.3f %15.3f %15.3f%n",tenHang,soLuong,donGia,tinhTongTien());
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
}
