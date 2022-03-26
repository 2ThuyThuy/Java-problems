package PhieuBTSo2.BT2;

import java.util.Scanner;

public class Mon {
    private String tenMon;
    private int soHocTrinh;
    private String hocKy;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten mon: ");
        tenMon = sc.nextLine();
        System.out.print("So hoc trinh: ");
        soHocTrinh = sc.nextInt();
        System.out.print("Hoc ky: ");
        hocKy = sc.nextLine();
        hocKy = sc.nextLine();
    }

    static void inTT(){
        System.out.printf("%20s %15s %20s","Mon","So hoc Trinh","Hoc Ki");
    }
    public void xuat(){
        System.out.printf("%20s %15s %20s",tenMon,soHocTrinh,hocKy);
    }
}
