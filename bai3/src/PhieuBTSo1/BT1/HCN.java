package PhieuBTSo1.BT1;

import java.util.Random;

public class HCN {
    private  float dai, rong;
    public float tinhDienTich() {
        return dai*rong;
    }
    public float tinhChuVi() {
        return (dai+rong)*2;
    }
    void nhap() {
        Random random = new Random();
        dai = random.nextFloat()+1;
        rong = random.nextFloat()+1;
    }
    public static void inTieuDe() {
        System.out.printf("%15s%15s%15s%15s%n","Chiều dài ", "Chiều rộng "," Chu Vi", "Dien Tích");
    }
    public void xuat() {
        System.out.printf("%15.1f%15.1f%15.1f%15.1f%n",dai,rong,tinhChuVi(),tinhDienTich());
    }

    public static void main(String[] args) {
        HCN h = new HCN();
        h.nhap();
        HCN.inTieuDe();
        h.xuat();
    }
}
