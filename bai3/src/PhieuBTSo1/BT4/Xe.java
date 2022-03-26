package PhieuBTSo1.BT4;

import java.util.Scanner;

public class Xe {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private float triGia;

    public int getDungTich(){
        return dungTich;
    }
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.print("Loai xe: ");
        loaiXe = sc.nextLine();
        System.out.print("Dung tich: ");
        dungTich = sc.nextInt();
        System.out.print("Tri gia: ");
        triGia = sc.nextFloat();

    }
    public double tinhThue() {
        double thue=0;
        if(dungTich < 100)
            thue = (float) (1.0/100)*triGia;
        else if (dungTich <=200)
            thue = (float) (3.0/100)*triGia;
        else
            thue = (float) (5.0/100)*triGia;
        return thue;
    }
    public static void inThongTin() {
        System.out.printf("%25s%25s%25s%25s%25s%n","Tên chủ xe","Loại xe", "Dung tích","Trị giá","Thuế phải nộp");
        System.out.printf("----------------------------------------------------------------------------------------------------------------------%n");
    }
    public void  xuat() {
        System.out.printf("%25s%25s%25d%25.2f%25.2f%n",tenChuXe,loaiXe,dungTich,triGia,tinhThue());
    }
}
