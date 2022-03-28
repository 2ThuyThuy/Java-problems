package PhieuBTSo3.BT2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    static List<KhachHangNuocNgoai> dsKHNuocNgoai = new ArrayList<>();
    static List<KhachHangVietNam> dsKHVietNam = new ArrayList<>();
    static int soKHVietNam;
    static int soKHNuocNgoai;

    public static void TinhTongSL(){
        double tongSL=0;
        for(KhachHangVietNam khVietNam : dsKHVietNam)
            tongSL += khVietNam.soLD;
        System.out.println("Tổng số lượng(số KW tiêu thụ) của khách hàng Việt Nam: "+tongSL);
        tongSL = 0;
        for(KhachHangNuocNgoai khNuocNgoai: dsKHNuocNgoai)
            tongSL += khNuocNgoai.soLD;
        System.out.println("Tổng số lượng(số KW tiêu thụ) của khách hàng nước ngoài: "+tongSL);
    }
    public static void TBkhNuocNgoai() {
        double tongTien = 0;
        for(KhachHangNuocNgoai khNuocNgoai: dsKHNuocNgoai)
            tongTien += khNuocNgoai.thanhTien();
        tongTien = tongTien/soKHNuocNgoai;
        System.out.println("Trung bình thành tiền của khách hàng nước ngoài: ");
    }
    public static void XuatHoaDon(){
        System.out.println("DS hóa đơn trong tháng 09 năm 2013  ");
        int dem = 0;
        for(KhachHangVietNam khVietNam : dsKHVietNam)
            if(khVietNam.ngayRaHoaDon.getNam() == 2013 && khVietNam.ngayRaHoaDon.getThang() == 9)
                dem++;
        if (dem > 0) {
            KhachHangVietNam.InTT();
            for(KhachHangVietNam khVietNam : dsKHVietNam)
                if(khVietNam.ngayRaHoaDon.getNam() == 2013 && khVietNam.ngayRaHoaDon.getThang() == 9)
                    khVietNam.xuat();
            dem = 0;
        }
        for(KhachHangNuocNgoai khNuocNgoai: dsKHNuocNgoai)
            if(khNuocNgoai.ngayRaHoaDon.getNam() == 2013 && khNuocNgoai.ngayRaHoaDon.getThang() == 9)
                dem++;
        if(dem > 0) {
            KhachHangNuocNgoai.InTT();
            for(KhachHangNuocNgoai khNuocNgoai: dsKHNuocNgoai)
                if(khNuocNgoai.ngayRaHoaDon.getNam() == 2013 && khNuocNgoai.ngayRaHoaDon.getThang() == 9)
                    khNuocNgoai.xuat();

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số khách hàng việt nam: ");
        soKHVietNam = sc.nextInt();
        for(int i=0; i<soKHVietNam; i++) {
            KhachHangVietNam khVietNam = new KhachHangVietNam();
            khVietNam.nhap();
            dsKHVietNam.add(khVietNam);
        }
        System.out.print("Nhập số khách hàng nước ngoài: ");
        soKHNuocNgoai = sc.nextInt();
        for(int i=0; i<soKHNuocNgoai; i++) {
            KhachHangNuocNgoai khNuocNgoai = new KhachHangNuocNgoai();
            khNuocNgoai.nhap();
            dsKHNuocNgoai.add(khNuocNgoai);
        }

        System.out.println("Danh sách khách hàng");
        KhachHangVietNam.InTT();
        dsKHVietNam.forEach(KhachHangVietNam::xuat);
//        for(KhachHangVietNam khVietNam : dsKHVietNam)
//            khVietNam.xuat();
        KhachHangNuocNgoai.InTT();
        dsKHNuocNgoai.forEach(KhachHangNuocNgoai::xuat);
//        for(KhachHangNuocNgoai khNuocNgoai: dsKHNuocNgoai)
//            khNuocNgoai.xuat();

        TinhTongSL();
        TBkhNuocNgoai();
        XuatHoaDon();

    }
}
