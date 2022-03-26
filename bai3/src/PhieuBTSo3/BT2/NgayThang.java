package PhieuBTSo3.BT2;

import java.util.Scanner;

public class NgayThang {
    private int ngay;
    private int thang;
    private int nam;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ngay: ");
        ngay = sc.nextInt();
        System.out.print("Thang: ");
        thang = sc.nextInt();
        System.out.println("Nam: ");
        nam = sc.nextInt();
    }
    public String toString(){
        return ngay + "/" + thang + "/" + nam;
    }
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
}
