package PhieuBTSo3.BT3;

import java.util.Scanner;

public class NVVanPhong extends NhanVien{

    private long  mucLuong;
    private int ngayNghi;

    @Override
    public Long luong() {
        return mucLuong - ngayNghi*10000l;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();

        System.out.print("Mức lương: ");
        mucLuong = sc.nextLong();
        System.out.print("Ngày nghỉ: ");
        ngayNghi = sc.nextInt();
    }
    public static void InTT(){
        System.out.println("Nhân viên văn phòng: ");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s%n",
                "Họ tên","Năm vào làm","Mức lương","Ngày nghỉ","Lương","Phụ cấp","Tổng Lương");
    }
    public void xuat() {
        System.out.printf("%15s %15d %15d %15d %15d %15d %15d%n",
                hoTen,namVaoLam,mucLuong,ngayNghi,luong(),phuCap,tongTien());
    }

}
