package PhieuBTSo2.BT2;

import java.util.Scanner;

public class SinhVien {
    static String hoTen;
    static Date ngaySinh;
    static int soMon;
    static Mon monHoc[];
    static float diemThi[];

    static void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        hoTen = sc.nextLine();
        ngaySinh = new Date();
        ngaySinh.nhap();
        System.out.print("So mon: ");
        soMon = sc.nextInt();
        monHoc = new Mon[soMon];
        diemThi = new float[soMon];
        for(int i=0; i<soMon; i++) {
            System.out.println("Thong tin mon hoc thu: "+(i+1));
            monHoc[i] = new Mon();
            monHoc[i].nhap();

            System.out.print("Diem: ");
            diemThi[i] = sc.nextFloat();
        }

    }
    static void xuat() {
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Ngay sinh:" + ngaySinh.toString());
        Mon.inTT();
        System.out.printf("%10s %n","Diem");
        int i=0;
        for(Mon motMon : monHoc){
            motMon.xuat();
            System.out.printf("%10.2f %n",diemThi[i++]);
        }
    }


    public static void main(String[] args) {
        nhap();
        xuat();
    }
}
