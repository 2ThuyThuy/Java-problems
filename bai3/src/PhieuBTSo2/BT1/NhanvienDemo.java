package PhieuBTSo2.BT1;

import java.util.Scanner;

public class NhanvienDemo {
    static NhanVien dsnv[];
    static int n;

    static void nhapDSNV(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so nguyen tu mang n=");
        n = sc.nextInt();
        dsnv = new NhanVien[n];
        for(int i=0; i<n; i++) {
            System.out.print("nhap nhan vien thu "+(i+1 )+":");
            dsnv[i]=new NhanVien();
            dsnv[i].nhap();
        }
    }
    static  void inDSNV(){
        System.out.println("DS Nhan vien sau khi nhap: ");
        NhanVien.xuatTieuDe();
        for(NhanVien nv: dsnv)
            nv.xuat();

    }
    public static void main(String[] args) {
        nhapDSNV();
        inDSNV();
    }
}
