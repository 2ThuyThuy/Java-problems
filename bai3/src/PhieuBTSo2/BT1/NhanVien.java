package PhieuBTSo2.BT1;

import java.util.Scanner;

public class NhanVien {
    private  String hoDem;
    private  String ten;
    private NgayThang ngaySinh = new NgayThang();
    private NgayThang ngayVaoLam = new NgayThang();

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho dem=");
        hoDem=sc.nextLine();
        System.out.print("Ten nhan vien =");
        ten=sc.nextLine();
        System.out.println("nhap ngay, thang, nam sinh=");
        ngaySinh.nhap();
        System.out.println("nhap ngay, thang, nam vao lam=");
        ngayVaoLam.nhap();
    }
    static void xuatTieuDe(){
        System.out.printf("%-15s%-10s%15s%15s%n", "Ho dem","Ten", "Ngay sinh", "Ngay vao lam");
    }
    public void xuat() {
        System.out.printf("%-15s%-10s%15s%15s%n", hoDem,ten,ngaySinh,ngayVaoLam);
    }
}
