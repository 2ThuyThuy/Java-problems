package PhieuBTSo1.BT4;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiToanDKXe {
    static Xe dsXe[];
    static  int n;

    static void nhap(){
        System.out.print("Nhap so luong xe: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        dsXe = new Xe[n];
        for(int i=0; i<n; i++){
            dsXe[i]= new Xe();
            dsXe[i].nhap();

        }
    }
    static  void inDSXe(){
        Xe.inThongTin();
        for(Xe x: dsXe)
            x.xuat();
    }

    public static void main(String[] args) {
      int chon =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Nhap thong tin xe");
            System.out.println("2. Xuat bang ke thue");
            System.out.println("3. Thoat");
            System.out.println("Lua Chon");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    nhap();
                    break;
                case 2:
                    inDSXe();
                    break;
                case 3:
                    System.exit(0);

            }
        }while(chon != 3);
    }
}
