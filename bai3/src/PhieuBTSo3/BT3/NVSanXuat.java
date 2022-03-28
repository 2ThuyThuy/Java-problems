package PhieuBTSo3.BT3;

import java.time.LocalDate;
import java.util.Scanner;

public class NVSanXuat extends NhanVien{

    private int sanPham;

    @Override
    public Long luong() {
        return sanPham*20000l;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Sản phẩm: ");
        sanPham = sc.nextInt();

        LocalDate localDate = LocalDate.now(); // lấy thời điểm hiện tại á
        phuCap += 20000l*(localDate.getYear() - namVaoLam);

    }

    public static void InTT(){
        System.out.println("Nhân viên văn phòng: ");
        System.out.printf("%15s %15s %15s %15s %15s %15s%n",
                "Họ tên","Năm vào làm","Sản phẩm","Lương","Phụ cấp","Tổng Lương");
    }

    public void xuat() {
        System.out.printf("%15s %15d %15d %15d %15d %15d%n",
                hoTen,namVaoLam,sanPham,luong(),phuCap,tongTien());
    }
}
