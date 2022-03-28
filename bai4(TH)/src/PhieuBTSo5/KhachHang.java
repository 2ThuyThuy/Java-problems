package PhieuBTSo5;

import java.util.Scanner;

public class KhachHang {
    private String hoTen,diaChi;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Dia Chi: ");
        diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
