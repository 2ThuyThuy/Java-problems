package PhieuBTSo1.BT2;

import java.util.Random;

public class HinhTron {
    private double banKing,duongKinh;
    public double tinhChuVi(){
        return (2*banKing*Math.PI);
    }
    public double tinhDienTich() {
        return banKing*banKing*Math.PI;
    }
    void nhap() {
        Random random = new Random();
        banKing = random.nextDouble()+10;
        duongKinh = banKing*2;
    }
    public  static void inTieuDe() {
        System.out.printf("%15s%15s%15s%15s%n","Bán kính", "Đường Kính","Chu vi","Diện tích");
    }
    public  void xuat() {
        System.out.printf("%15.3f%15.3f%15.3f%15.3f%n",banKing,duongKinh,tinhChuVi(),tinhDienTich());
    }

    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.nhap();
        HinhTron.inTieuDe();
        hinhTron.xuat();
    }
}
