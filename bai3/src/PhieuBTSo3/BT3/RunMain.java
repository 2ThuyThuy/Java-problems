package PhieuBTSo3.BT3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    private static List<NVSanXuat> dsNVSanXuat = new ArrayList<>();
    private static List<NVVanPhong> dsNVVanPhong = new ArrayList<>();
    private static int soNVSanXuat;
    private static int soNVVanPhong;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("số nhân viên sản xuất: ");
        soNVSanXuat = sc.nextInt();
        for(int i=0; i<soNVSanXuat; i++) {
            NVSanXuat nvSanXuat = new NVSanXuat();
            nvSanXuat.nhap();
            dsNVSanXuat.add(nvSanXuat);
        }
        System.out.print("số nhân viên văn phòng: ");
        soNVVanPhong = sc.nextInt();
        for(int i=0; i<soNVVanPhong; i++) {
            NVVanPhong nvVanPhong = new NVVanPhong();
            nvVanPhong.nhap();
            dsNVVanPhong.add(nvVanPhong);
        }
        Long tongTienThang=0l;
        System.out.println("Danh sách nhân viên vừa nhập: ");
        NVSanXuat.InTT();
        for(NVSanXuat nvSanXuat : dsNVSanXuat) {
            nvSanXuat.xuat();
            tongTienThang += nvSanXuat.tongTien();
        }

        NVVanPhong.InTT();
        for(NVVanPhong nvVanPhong: dsNVVanPhong){
            nvVanPhong.xuat();
            tongTienThang += nvVanPhong.tongTien();
        }

        System.out.println("Tổng tiền công ty phải trả một tháng là: "+tongTienThang);



    }


}
