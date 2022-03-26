package PhieuBTSo2.BT2;

import java.util.Scanner;

public class Date {
    private int ngay;
    private int thang;
    private int nam;

    public String toString() {
        return (ngay +"/" + thang + "/" + nam);
    };

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ngay: ");
        ngay = sc.nextInt();
        System.out.print("thang: ");
        thang = sc.nextInt();
        System.out.print("nam: ");
        nam = sc.nextInt();
    }
}
