package PhieuBTSo2.BT2;

import java.util.Scanner;

public class Date {
    private int ngay;
    private int thang;
    private int nam;

    public String toString() {
        return (ngay +"/" + thang + "/" + nam);
    };
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
