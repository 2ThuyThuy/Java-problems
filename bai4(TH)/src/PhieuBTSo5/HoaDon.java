package PhieuBTSo5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HoaDon {
    private String soHD;
    private String ngayHD;
    private int soMatHang;
    private KhachHang kh = new KhachHang();
    private List<Hang> dsHang = new ArrayList<>();

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("So Hoa Don: ");
        soHD = sc.nextLine();
        System.out.print("Ngay HD: ");
        ngayHD = sc.nextLine();
        System.out.print("So Mat Hang: ");
        soMatHang = sc.nextInt();
        for(int i=0; i<soMatHang; i++) {
            Hang hang = new Hang();
            hang.nhap();
            dsHang.add(hang);
        }
    }
    public void inHD() {
        System.out.printf("%15s : %15s","So HD ",soHD);
        System.out.printf("%15s : %15s","Ngay HD", ngayHD);
        System.out.printf("%15s : %15s","so Mat Hang",soMatHang);
        kh.toString();
        Hang.inTieuDe();
        dsHang.forEach(Hang::inDL);
    }
    public void sapXep() {
        dsHang.sort(new Comparator<Hang>() {
            @Override
            public int compare(Hang o1, Hang o2) {
                return o1.getTenHang().compareTo(o2.getTenHang());
            }
        });
    }

}
